package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        Country poland = new Country("Poland", new BigDecimal("38625478"));
        Country portugal = new Country("Portugal", new BigDecimal("10409995"));
        Country germany = new Country("Germany", new BigDecimal("80716000"));
        Country russia = new Country("Russia", new BigDecimal("143975923"));
        Country japan = new Country("Japan", new BigDecimal("127748513"));
        Country china = new Country("China", new BigDecimal("1403500365"));
        Country egypt = new Country("Egypt", new BigDecimal("82868000"));
        Country morocco = new Country("Morocco", new BigDecimal("34859364"));
        Country tunisia = new Country("Tunisia", new BigDecimal("10486339"));

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        europe.addCoountry(poland);
        europe.addCoountry(germany);
        europe.addCoountry(portugal);
        asia.addCoountry(russia);
        asia.addCoountry(japan);
        asia.addCoountry(china);
        africa.addCoountry(egypt);
        africa.addCoountry(morocco);
        africa.addCoountry(tunisia);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        BigDecimal worldPeoplePopulation = world.getPeopleQuantity();

        // ręcznie obliczona suma populacji państw utworzonych w ramach testu to: 1933189977 osób.
        Assert.assertEquals(new BigDecimal("1933189977"), worldPeoplePopulation);
    }


}
