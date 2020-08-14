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

public abstract class Discount {
	protected double amount;
	enum Type{

		AMOUNT,
		PERCENTAGE}
	//Usman K, has constructor
	public Discount(double a){

		amount = a;}
	public abstract double applyDiscount(double price);}
