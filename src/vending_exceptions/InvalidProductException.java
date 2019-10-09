package vending_exceptions;

import products.Product;

public class InvalidProductException extends RuntimeException {

    public InvalidProductException(Product product) {
        System.out.println(product.getName() + " This is not the product we sell on the shop");
    }
}
