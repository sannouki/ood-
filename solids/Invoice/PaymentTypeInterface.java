package Invoice;

public interface PaymentTypeInterface {
    public void processPayment(String paymentType); //this will allow the user to pass in a payment type
    //(any cards, venmo, zelle, etc)
}
