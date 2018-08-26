package com.kodilla.good.patterns.challenges.challenge9_4.interfaces;

import java.util.List;

public interface Producer {
    String getProducerName();
    String getProducerDescription();
    List<Product> getAvailableProducts();
    boolean process(List<Product> lstOrder);
}
