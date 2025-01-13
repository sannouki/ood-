package Invoice;

public class Paypal implements PaymentTypeInterface{
     private double amount;

     public Paypal(double amount) {
         this.amount = amount;
        }
    
         public double getAmount()
         {
             return amount;
         }
    
         public void setAmount(double amount) {
             this.amount = amount;
         }

        @Override
        public void processPayment(String paymentType)
        {   
            if (paymentType.toLowerCase().equals("paypal"))
            {
                System.out.println(" processing " + paymentType + " of $"+ amount);
            }
    
        }
}
