package com.kodilla.good.patterns.challenges.challenge9_4.producers;

import com.kodilla.good.patterns.challenges.challenge9_4.interfaces.Producer;
import com.kodilla.good.patterns.challenges.challenge9_4.interfaces.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExtraFoodShop implements Producer {
    private List<Product> lstProducts;

    public ExtraFoodShop() {
        downloadListOfProducts();
    }

    @Override
    public String getProducerName() {
        return "ExtraFoodShop";
    }

    @Override
    public String getProducerDescription() {
        return "Description of producer "+getProducerName()+": example description.";
    }

    @Override
    public List<Product> getAvailableProducts() {
        return lstProducts;
    }

    @Override
    public boolean process(List<Product> lstOrder) {
        lstOrder = lstOrder.stream().filter(n -> n instanceof ExtraFoodShopProduct).collect(Collectors.toList());
        if(lstOrder.size()>0) {
            System.out.println("Sending request to "+getProducerName()+"'s ordering system...");
            System.out.println("Receiving response...");
            System.out.print("Success! Ordered items from "+getProducerName()+": ");
            System.out.print(lstOrder.stream().map(Product::getItemID).map(String::valueOf).collect(Collectors.joining(", "))+"\n");
            System.out.println("Sending status to user...");
        } else {
            System.out.println("Nothing to order from "+getProducerName()+". Skipping...");
            return false;
        }
        return true;
    }

    private void downloadListOfProducts(){
        System.out.println("downloading list of products for "+getProducerName()+"...");
        lstProducts = new ArrayList<>();
        lstProducts.add(new ExtraFoodShopProduct(4232432, "Product1", true, 54,"item", new BigDecimal("4.50")));
        lstProducts.add(new ExtraFoodShopProduct(4232433, "Product2", true, 124.5,"kg", new BigDecimal("10.50")));
        lstProducts.add(new ExtraFoodShopProduct(4232434, "Product3", false, 21.5,"l", new BigDecimal("5.50")));
    }

}
