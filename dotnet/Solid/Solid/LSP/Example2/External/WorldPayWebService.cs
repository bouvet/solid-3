﻿namespace Solid.LSP.Example2.External
{
    public class WorldPayWebService
    {
        public string MakeRefund(decimal amount, string transactionId, string username, string password, string productId)
        {
            return "Success";
        }
    }
}
