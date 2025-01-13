package Invoice;

public class DebitCard implements PaymentTypeInterface{
    private double amount;

    public DebitCard(double amount) {
        this.amount = amount;
        }
    
        public double getAmount()
        {
            return amount;
        }
    
        public void setAmount(double amount) {
            this.amount = amount;
        }
    //
        @Override
        public void processPayment(String paymentType)
        {   
            if (paymentType.toLowerCase().equals("debitcard"))
            {
                System.out.println(" processing " + paymentType + " of $"+ amount);
            }
    
        }
}
