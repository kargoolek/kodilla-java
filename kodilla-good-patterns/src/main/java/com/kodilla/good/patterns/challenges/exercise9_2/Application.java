package com.kodilla.good.patterns.challenges.exercise9_2;

public class Application {

    public static void main(String[] args) {
        OrderRequestReceiver orderReceiver = new OrderRequestReceiver();
        OrderRequest orderRequest = orderReceiver.getNewOrder();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new SMSService(), new WebOrderService(), new WebOrdersRepository());
        productOrderProcessor.process(orderRequest);
    }

}
