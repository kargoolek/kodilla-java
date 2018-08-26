package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {

    final static String CLASS_NAME = "'"+CollectionTestSuite.class.getSimpleName()+"'";

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Starting new test suite: "+ CLASS_NAME);
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Testing test suite: "+ CLASS_NAME+" ended.");
    }

    @Before
    public void before(){
        System.out.println("New test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator ex = new OddNumbersExterminator();
        ArrayList<Integer> lstEmptyTest = new ArrayList<Integer>();
        ArrayList<Integer> lstTest = new ArrayList<Integer>();

        lstTest = ex.exterminate(lstEmptyTest);

        System.out.println("Testing empty list...");

        Assert.assertEquals(lstEmptyTest, lstTest);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator ex = new OddNumbersExterminator();
        ArrayList<Integer> lstTest = new ArrayList<Integer>();

        Random r = new Random();
        for(int i = 0; i < 100; i++){
            lstTest.add(r.nextInt());
        }

        lstTest = ex.exterminate(lstTest);

        System.out.println("Testing list of 100 random integers...");
        System.out.println("*** generated list for test: "+lstTest.toString());

        for(int n : lstTest){
            Assert.assertEquals(0, n % 2);
        }
    }

}






/*
W katalogu src/main/java utwórz pakiet com.kodilla.testing.collection
W utworzonym pakiecie stwórz klasę OddNumbersExterminator, posiadającą metodę exterminate(ArrayList<Integer> numbers)
przyjmującą jako argument kolekcję ArrayList liczb typu Integer,
która zwraca również kolekcję ArrayList liczb typu Integer, stanowiącą podzbiór kolekcji wejściowej z pominięciem liczb nieparzystych.
W katalogu src/test/java utwórz pakiet com.kodilla.testing.collection.
W utworzonym pakiecie stwórz klasę testową (zbiór testów) CollectionTestSuite, a w niej napisz testy sprawdzające, czy metoda filtrująca liczby nieparzyste działa poprawnie:
testOddNumbersExterminatorEmptyList (sprawdzi, czy klasa zachowuje się poprawnie, gdy lista jest pusta)
testOddNumbersExterminatorNormalList (sprawdzi, czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste)
Użyj również adnotacji @Before oraz @After, aby wyświetlić informację o tym, jakie operacje (testy) są aktualnie wykonywane.
 */