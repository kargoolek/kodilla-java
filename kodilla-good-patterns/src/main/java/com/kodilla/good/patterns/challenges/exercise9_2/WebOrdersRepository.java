package com.kodilla.good.patterns.challenges.exercise9_2;

import java.time.LocalDateTime;
import java.util.List;

public class WebOrdersRepository implements ItemsRepository {
    @Override
    public void saveOrder(final User user, final List<Item> lstItems, final boolean isRealized, final LocalDateTime orderTime) {
        System.out.println("Saving order details into remote database....");
    }
}
