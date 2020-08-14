/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartdemos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;
/**
 *
 * @author Usman Khan
 */
public class CartTest {
    
    public CartTest() {
        
    }
    

    
    @BeforeClass
    public static void setUp() {
    }
    
    @AfterClass
    public static void tearDown() {
    }

    
    @Test
    public void testGetCartSizeGood() {
        System.out.println("getCartSize");
        Cart instance = new Cart();
        int expResult = 0;
        int result = instance.getCartSize();
        assertEquals(expResult, result);
        assertEquals("Card doesn't have min length required") , expResult , result);
    }
    @Test
    public void testGetCartSizeBad() {
        System.out.println("getCartSize");
        Cart instance = new Cart();
        int expResult = 0;
        int result = instance.getCartSize();
        assertEquals(expResult, result);
        assertEquals("Card doesn't have min length required") , expResult , result);

    }    
}

    
