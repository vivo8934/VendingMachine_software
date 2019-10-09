package vending_exceptions;

import products.Product;

public class ChocolatesAllGoneException extends ProductNotFoundException {
    public ChocolatesAllGoneException(Product product) {
        super(product);
    }
}
