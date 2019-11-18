package models;

import org.junit.Assert;
import org.junit.Test;

public class ComicTest {

    @Test
    public void setNameTest(){
        String expected = "Batman: Year One";

        Comic testComic = new Comic();
        testComic.setTitle(expected);

        Assert.assertEquals(expected,testComic.getTitle());
    }

    @Test
    public void constructorTest(){
        Integer expectedId = 8787;
        String expectedTitle = "Batman: Year One";
        String expectedPublisher = "DC Comics";
        String expectedSeries = "Batman";
        Integer expectedIssueNumber = 1;
        Integer expectedQty = 10;
        Float expectedPrice = 6.75F;

        Comic testComic = new Comic(expectedId,expectedTitle,expectedPublisher,expectedSeries,expectedIssueNumber,expectedQty,expectedPrice);

        Assert.assertEquals(expectedId,testComic.getId());
        Assert.assertEquals(expectedTitle,testComic.getTitle());
        Assert.assertEquals(expectedIssueNumber,testComic.getIssueNumber());
        Assert.assertEquals(expectedPrice,testComic.getPrice());
        Assert.assertEquals(expectedPublisher,testComic.getPublisher());
        Assert.assertEquals(expectedQty,testComic.getQty());
        Assert.assertEquals(expectedSeries,testComic.getSeries());
    }
}
