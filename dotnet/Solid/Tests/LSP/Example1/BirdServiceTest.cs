using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Solid.LSP.Example1;

namespace Tests.LSP.Example1
{
    [TestClass]
    public class BirdServiceTest
    {
        private BirdService _subject;


        [TestInitialize]
        public void Setup()
        {
            _subject = new BirdService();
        }

        [TestMethod]
        public void TestFeedThemAll()
        {
            _subject.FeedThemAll(AllBirds());
        }

        [TestMethod]
        public void TestLetThemGo()
        {
            _subject.LetThemGo(AllBirds());
        }

        private List<Bird> AllBirds()
        {
            return new List<Bird>
                   {
                        new Duck(),
                        new Penguin(),
                        new Crow()
                   };
        }
    }
}
