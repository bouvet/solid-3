using Microsoft.VisualStudio.TestTools.UnitTesting;
using Solid.LSP.Example2.Services;

namespace Tests.LSP.Example2
{
    [TestClass]
    public class RefundServiceTest
    {
        private RefundService _subject;

        [TestInitialize]
        public void Setup()
        {
            _subject = new RefundService();
        }

        [TestMethod]
        public void TestRefundPayPal()
        {
            bool result = _subject.Refund(PaymentType.PayPal, 100, "ABC123");
            Assert.IsTrue(result);
        }

        [TestMethod]
        public void TestRefundWorldPay()
        {
            bool result = _subject.Refund(PaymentType.WorldPay, 100, "ABC123");
            Assert.IsTrue(result);
        }
    }
}
