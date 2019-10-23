package com.soge.service;

import com.soge.exception.NotEnoughProductsInStockException;
import com.soge.model.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();

    Map<Product, Integer> getProductByName(String item);
}
