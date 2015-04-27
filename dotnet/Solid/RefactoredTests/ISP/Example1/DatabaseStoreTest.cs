using Microsoft.VisualStudio.TestTools.UnitTesting;
using RefactoredSolid.ISP.Example1;

namespace RefactoredTests.ISP.Example1
{
    [TestClass]
    public class DatabaseStoreTest
    {
        private DatabaseStore _subject;

        [TestInitialize]
        public void Setup()
        {
            _subject = new DatabaseStore();
            _subject.Open();
        }

        [TestCleanup]
        public void Teardown()
        {
            _subject.Close();
        }

        [TestMethod]
        public void Test()
        {
            string result = _subject.ExecuteQuery("advancedQuery");
            Assert.AreEqual("Query result!", result);
        }
    }
}
