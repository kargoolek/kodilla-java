package com.kodilla.good.patterns.challenges.challenge9_4;

import com.kodilla.good.patterns.challenges.challenge9_4.interfaces.Producer;
import com.kodilla.good.patterns.challenges.challenge9_4.interfaces.Product;
import com.kodilla.good.patterns.challenges.challenge9_4.producers.AllProducersAndProductsDatabase;

import java.util.List;
import java.util.Set;

public class ProductOrderProcessor {

    public void process(final OrderRequest orderRequest) {
        List<Product> lstOrder = orderRequest.getOrderedItems();
        AllProducersAndProductsDatabase database = new AllProducersAndProductsDatabase();
        Set<Producer> lstProducers = database.getAllProducers();

        for(Producer p : lstProducers){
            p.process(lstOrder);
        }
    }
}
