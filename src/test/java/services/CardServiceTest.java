package services;

import models.Card;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class CardServiceTest {
    CardServices cardServices = new CardServices();
    private ArrayList<Card> cardInventory = new ArrayList<>();

    @Before
    public void setUp(){
        Card siegeRhino = cardServices.create("Siege Rhino","Magic","Khans of Tarkir",44,1.5);
        Card hardenedScales = cardServices.create("Hardened Scales", "Magic", "Khans of Tarkir", 14,3.5);
        Card stormChaserMage = cardServices.create("Stormchaser Mage", "Magic", "Oath of the Gatewatch", 180, .75);
        cardInventory.add(stormChaserMage);
        cardInventory.add(siegeRhino);
        cardInventory.add(hardenedScales);
    }

    @Test
    public void createTest() {
        String expectedName = "Siege Rhino";
        String expectedGame = "Magic";
        String expectedExpansion = "Khans of Tarkir";
        Integer expectedQty = 44;
        Double expectedPrice = 1.5;

        CardServices cardServices = new CardServices();
        Card testCard = cardServices.create(expectedName, expectedGame, expectedExpansion, expectedQty, expectedPrice);

        Integer actualId = testCard.getId();
        String actualName = testCard.getName();
        String actualGame = testCard.getGame();
        String actualExpansion = testCard.getExpansion();
        Integer actualQty = testCard.getQty();
        Double actualPrice = testCard.getPrice();

        Assert.assertEquals(Integer.class.getName(), actualId.getClass().getName());
        Assert.assertEquals(expectedExpansion, actualExpansion);
        Assert.assertEquals(expectedGame, actualGame);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedPrice, actualPrice);
        Assert.assertEquals(expectedQty, actualQty);
    }

    @Test
    public void findTest(){
        Card expected = cardServices.create("Siege Rhino","Magic","Khans of Tarkir",44,1.5);
        Card actual = cardServices.findCard(1);

        Assert.assertEquals(expected.getName(),actual.getName());

    }

    @Test
    public void findTest2(){
        Card expected = cardServices.create("Stormchaser Mage", "Magic", "Oath of the Gatewatch", 180, .75);
        Card actual = cardServices.findCard(3);

        Assert.assertEquals(expected.getName(),actual.getName());
    }

    @Test
    public void findAllTest(){
        Collections.sort(cardInventory);
        Card[] expected = cardInventory.toArray(new Card[0]);
        Card[] actual = cardServices.findAll();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void deleteTest(){
        Integer id = 1;
        Boolean result = cardServices.delete(id);
        Assert.assertTrue(result);
        Assert.assertFalse(cardInventory.contains(cardServices.findCard(id)));
    }

    @After
    public void tearDown(){
        CardServices.setNextId(1);
        cardInventory.clear();
    }
}
