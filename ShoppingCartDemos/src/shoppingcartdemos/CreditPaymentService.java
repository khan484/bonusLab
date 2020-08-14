package shoppingcartdemos;



/**

 *

 * @author UK

 */

public class CreditPaymentService extends PaymentService {
    public void processPayment( double amount ) {

        System.out.println( "Processing credit payment of $" + amount );

    }

    

}