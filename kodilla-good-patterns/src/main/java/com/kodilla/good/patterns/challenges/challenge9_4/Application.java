package com.kodilla.good.patterns.challenges.challenge9_4;

public class Application {

    public static void main(String[] args) {
        OrderRequestReceiver orderReceiver = new OrderRequestReceiver();
        OrderRequest orderRequest = orderReceiver.getNewOrder();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor();
        productOrderProcessor.process(orderRequest);
    }


}
