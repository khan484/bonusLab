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

public class DiscountByAmount extends Discount{



	public DiscountByAmount(double a) {

		super(a);
	}
	@Override

	public double applyDiscount(double price) {
		double new_price = price-this.amount;
		if(new_price < 0)
			return 0;
		else
			return new_price;}}