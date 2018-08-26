package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> lstEven = new ArrayList<Integer>();

        for(int n : numbers) {
            if (n % 2 == 0) {
                lstEven.add(n);
            }
        }

        return lstEven;
    }

}
