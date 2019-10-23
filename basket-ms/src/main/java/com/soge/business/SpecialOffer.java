package com.soge.business;

import com.soge.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;

public class SpecialOffer {
    @Autowired
    private ShoppingCartService shoppinCartService;

    public ShoppingCartService getShoppinCartService() {
        return shoppinCartService;
    }


}
