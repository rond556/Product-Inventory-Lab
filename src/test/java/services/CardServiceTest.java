package services;

import models.Card;
import org.junit.Assert;
import org.junit.Test;

public class CardServiceTest {


    @Test
    public void createTest() {
        String expectedName = "Siege Rhino";
        String expectedGame = "Magic";
        String expectedExpansion = "Khans of Tarkir";
        Integer expectedQty = 44;
        Float expectedPrice = 1.5F;

        CardServices cardServices = new CardServices();
        Card testCard = cardServices.create(expectedName, expectedGame, expectedExpansion, expectedQty, expectedPrice);

        Integer actualId = testCard.getId();
        String actualName = testCard.getName();
        String actualGame = testCard.getGame();
        String actualExpansion = testCard.getExpansion();
        Integer actualQty = testCard.getQty();
        Float actualPrice = testCard.getPrice();

        Assert.assertEquals(Integer.class.getName(), actualId.getClass().getName());
        Assert.assertEquals(expectedExpansion, actualExpansion);
        Assert.assertEquals(expectedGame, actualGame);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedPrice, actualPrice);
        Assert.assertEquals(expectedQty, actualQty);
    }
}
