package com.kodilla.good.patterns.challenges.exercise9_2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderRequestReceiver {

    public OrderRequest getNewOrder(){
        User user = new User(123321, "Karol", "Bator", "karol15", "Moj Adres 66",
                "+48 222222222", "adres@mail.pl", 747212321, false);

        LocalDateTime orderTime = LocalDateTime.now();

        BookItem book1 = new BookItem(212323121);
        OthersItem other1 = new OthersItem(23212332);

        List<Item> orderList = new ArrayList<>();
        orderList.add(book1);
        orderList.add(other1);

        return new OrderRequest(user, orderTime, orderList);
    }

}
