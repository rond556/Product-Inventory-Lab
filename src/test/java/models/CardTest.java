package models;

import org.junit.Assert;
import org.junit.Test;

public class CardTest {

    @Test
    public void setNameTest(){
        String expected = "Siege Rhino";

        Card testCard = new Card();
        testCard.setName(expected);

        Assert.assertEquals(expected,testCard.getName());
    }

    @Test
    public void constructorTest(){
        Integer expectedId = 2345;
        String expectedName = "Siege Rhino";
        String expectedGame = "Magic";
        String expectedExpansion = "Khans of Tarkir";
        Integer expectedQty = 44;
        Float expectedPrice = 1.5F;

        Card testCard = new Card(expectedId,expectedName,expectedGame,expectedExpansion,expectedQty,expectedPrice);

        Assert.assertEquals(expectedId,testCard.getId());
        Assert.assertEquals(expectedExpansion,testCard.getExpansion());
        Assert.assertEquals(expectedGame,testCard.getGame());
        Assert.assertEquals(expectedName,testCard.getName());
        Assert.assertEquals(expectedPrice,testCard.getPrice());
        Assert.assertEquals(expectedQty,testCard.getQty());
    }
}
