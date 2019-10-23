package com.soge.business;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class SpecialOfferTest {
    @Autowired
    SpecialOffer specialOffer;

    @Test
    //SetUP the Quantity in the DB
    public void testPriceWith1Apple(){
        assertEquals(0.20, specialOffer.getShoppinCartService().getProductByName("Apple"));
    }

    @Test
    @Ignore
    //SetUP the Quantity in the DB
    //Offer: Buy One Get One Free
    public void testPriceWith2Apples(){
        assertEquals(0.20, specialOffer.getShoppinCartService().getProductByName("Apple"));
    }

    @Test
    @Ignore
    //SetUP the Quantity in the DB
    public void testPriceWith1Orange(){
        assertEquals(0.50, specialOffer.getShoppinCartService().getProductByName("Orange"));
    }

    @Test
    @Ignore
    //SetUP the Quantity in the DB
    //No Offer
    public void testPriceWith2Oranges(){
        assertEquals(1.00, specialOffer.getShoppinCartService().getProductByName("Orange"));
    }

    @Test
    @Ignore
    //SetUP the Quantity in the DB
    //Offer : Get 3 for the price of two
    // Not applicable right now
    public void testPriceWith1Watermelon(){
        assertEquals(0.80, specialOffer.getShoppinCartService().getProductByName("Watermelon"));
    }


    @Test
    @Ignore
    //SetUP the Quantity in the DB
    //Offer : Get 3 for the price of two
    // Not applicable right now
    public void testPriceWith2Watermelon(){
        assertEquals(1.60, specialOffer.getShoppinCartService().getProductByName("Watermelon"));
    }

    @Test
    @Ignore
    //SetUP the Quantity in the DB
    //Offer : Get 3 for the price of two
    // Not applicable right now
    public void testPriceWith3Watermelon(){
        assertEquals(1.60, specialOffer.getShoppinCartService().getProductByName("Watermelon"));
    }


}
