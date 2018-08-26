package com.kodilla.good.patterns.challenges.exercise9_2;

import java.util.List;
import java.util.stream.Collectors;

public class WebOrderService implements OrderService {
    @Override
    public boolean buy(final User user, final List<Item> lstItems) {
        System.out.println("processing buy... please wait....");
        System.out.print("Success! User "+user.getNick()+" just bought: ");
        System.out.print(lstItems.stream().map(n -> String.valueOf(n.getItemID())).collect(Collectors.joining(", "))+".\n");
        return true;
    }
}
