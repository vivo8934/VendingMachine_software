package vending_exceptions;

import products.Product;

public class ProductNotFoundException extends Exception {

    public ProductNotFoundException(Product product) {
        //super(product);
        System.out.println(product.getName() + " Is not on the Stock");
    }
}