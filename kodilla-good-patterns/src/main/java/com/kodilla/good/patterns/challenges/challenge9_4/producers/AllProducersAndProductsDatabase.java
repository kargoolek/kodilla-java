package com.kodilla.good.patterns.challenges.challenge9_4.producers;

import com.kodilla.good.patterns.challenges.challenge9_4.interfaces.Producer;
import com.kodilla.good.patterns.challenges.challenge9_4.interfaces.Product;

import java.util.HashSet;
import java.util.Set;

public class AllProducersAndProductsDatabase {

    public Set<Producer> getAllProducers() {
        Set<Producer> lst = new HashSet<>();
        lst.add(new ExtraFoodShop());
        lst.add(new HealthyShop());
        lst.add(new GlutenFreeShop());
        return lst;
    }

    public Set<Product> getAllProducts() {
        Set<Product> lst = new HashSet();
        for(Producer producer : getAllProducers()) {
            for (Product product : producer.getAvailableProducts()){
                lst.add(product);
            }
        }
        return lst;
    }

}
