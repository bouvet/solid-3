using Microsoft.VisualStudio.TestTools.UnitTesting;
using RefactoredSolid.ISP.Example1;

namespace RefactoredTests.ISP.Example1
{
    [TestClass]
    public class JsonStoreTest
    {
        private JsonStore _subject;

        [TestInitialize]
        public void Setup()
        {
            _subject = new JsonStore();
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
            string result = _subject.ReadFile();

            Assert.AreEqual("File content!", result);
        }
    }
}
