/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartdemos;

/**
 *
 * @author UK
 */
public class DiscountByPercentage extends Discount{



	public DiscountByPercentage(double a) {

		super(a);

	}
	@Override

	public double applyDiscount(double price) {

		double amountToSub = (100.0/price)*this.amount;

		return price - amountToSub;

	}



}
   
