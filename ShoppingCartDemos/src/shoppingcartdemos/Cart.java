package shoppingcartdemos;



import java.util.ArrayList;

import java.util.List;



/**

 *

 * @author UK

 */

public class Cart {

    private List <Product> products = new ArrayList<>( );

    private PaymentService service;
    private int cartSize;
    // Usman Khan
    //using aggregation

    private Discount discount = null;


    public void setPaymentService( PaymentService service ) {

        this.service  = service;

    }

    public void addProduct( Product product ) {

        products.add( product );

    }

    public void payCart( ) {

        double total = 0;
       for ( Product product : products ) {

           total += product.getPrice( );

       }

       if(discount != null) 

    	   total = discount.applyDiscount(total);
        service.processPayment( total );

    }
    public void addDiscount(Discount d) {

    	discount = d;

    }
    public int getCartSize(){
        cartSize = products.size();
        return cartSize;
    }


}