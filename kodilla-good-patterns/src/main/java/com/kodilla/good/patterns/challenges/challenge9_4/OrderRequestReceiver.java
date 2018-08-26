package com.kodilla.good.patterns.challenges.challenge9_4;

import com.kodilla.good.patterns.challenges.challenge9_4.interfaces.Product;
import com.kodilla.good.patterns.challenges.challenge9_4.producers.ExtraFoodShopProduct;
import com.kodilla.good.patterns.challenges.challenge9_4.producers.HealthyShopProduct;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderRequestReceiver {

    public OrderRequest getNewOrder(){
        System.out.println("Received new order. Processing...");

        User user = new User(123321, "Karol", "Bator", "karol15", "Moj Adres 66",
                "+48 222222222", "adres@mail.pl", 747212321, false);

        LocalDateTime orderTime = LocalDateTime.now();

        Product efsItem1 = new ExtraFoodShopProduct(4232433, 10);
        Product efsItem2 = new ExtraFoodShopProduct(4232434, 12.5);
        Product hsItem1 = new HealthyShopProduct(4232435, 12);

        List<Product> orderList = new ArrayList<>();
        orderList.add(efsItem1);
        orderList.add(efsItem2);
        orderList.add(hsItem1);


        return new OrderRequest(user, orderTime, orderList);
    }

}
