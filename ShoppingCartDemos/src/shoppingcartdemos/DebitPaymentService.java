package shoppingcartdemos;

public class DebitPaymentService extends PaymentService {

    public void processPayment( double amount ) {

        System.out.println( "Processing debit payment of $" + amount );

    }

}