package com.kodilla.good.patterns.challenges.exercise9_2;

import java.time.LocalDateTime;
import java.util.List;

public interface ItemsRepository {
    void saveOrder(User user, List<Item> lstItems, boolean isRealized, LocalDateTime orderTime);
}
