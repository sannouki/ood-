package Invoice;

public class CreditCard implements PaymentTypeInterface{
     private double amount;

     public CreditCard(double amount) {
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
            if (paymentType.toLowerCase().equals("creditcard"))
            {
                System.out.println(" processing " + paymentType + " of $" + amount);
            }
    
        }
}
