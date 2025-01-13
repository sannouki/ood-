package Invoice;

public class Invoice implements PaymentTypeInterface{
    private double amount;

    public Invoice(double amount) {
    this.amount = amount;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void processPayment(String paymentType)
     {//default if there is unknown payment method
         System.out.println("processing unknown payment name: " +paymentType + " $"+amount);
         
     }





}