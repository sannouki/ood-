package Invoice;

public class paymentMain {
    public static void main(String[] args) {
        CreditCard credit = new CreditCard(1230);
        credit.processPayment("creditcard");

        DebitCard debit = new DebitCard(123123.22);
        debit.processPayment("debitcard");
        
        Invoice invoice = new Invoice(333.22);
        invoice.processPayment("tom");

        Paypal paypal = new Paypal(333.24);
        paypal.processPayment("paypal");
    }
    

    
}
