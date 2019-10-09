package vending;

import products.Chocolates;
import products.Product;
import products.SaltySnacks;
import products.SoftDrinks;
import vending_exceptions.*;

public class VendingMachine {

    int stockCounter;
    int chocCounter;
    int saltyCounter;
    int softCounter;

    public  void buy(Product product) throws ProductNotFoundException, InvalidProductException {
        if(product instanceof Object){
            if (product instanceof Chocolates){
                if (chocCounter > 0){
                    stockCounter -= stockCounter;
                    chocCounter -= chocCounter;
                }
                else {
                    throw new ChocolatesAllGoneException(product);
                }
            }
            else if(product instanceof SaltySnacks){
                    if(saltyCounter > 0){
                        stockCounter -= stockCounter;
                        saltyCounter -= saltyCounter;
                    }else {
                        throw new SaltyCracksAllEatenException(product);
                    }
            }
            else if (product instanceof SoftDrinks){
                    if (softCounter > 0){
                        stockCounter -= stockCounter;
                        softCounter -= softCounter;
                    }else {
                        throw new SoftDrinksOutOfStockException(product);
                    }
            }
        }
    }
    public void addStock(Product product, int newStock){

        if (product instanceof SoftDrinks){
            softCounter += newStock;
        }
        else if (product instanceof SaltySnacks){
            saltyCounter += newStock;
        }
        else if (product instanceof Chocolates){
            chocCounter += newStock;
        }

        stockCounter += newStock;
    }

    public int getStockCounter(){
        return stockCounter;
    }

    public static void main(String[] args) throws ProductNotFoundException {

        VendingMachine vendingMachine = new VendingMachine();
        Product drink = new SoftDrinks("coke", "500ml coke-zero");
        Product snacks = new SaltySnacks("peanuts", "20g");
        Product choc = new Chocolates("PS" , "200g");


        vendingMachine.addStock(drink, 2);
        vendingMachine.buy(drink);
        vendingMachine.getStockCounter();
       // vendingMachine.buy(snacks);
       // vendingMachine.buy(choc);
    }
}
