package services;

import models.Comic;
import org.junit.Assert;
import org.junit.Test;

public class ComicServiceTest {

    @Test
    public void createTest() {
        String expectedTitle = "Batman: Year One";
        String expectedPublisher = "DC Comics";
        String expectedSeries = "Batman";
        Integer expectedIssueNumber = 1;
        Integer expectedQty = 10;
        Float expectedPrice = 6.75F;

        ComicServices comicServices = new ComicServices();
        Comic testCard = comicServices.create(expectedTitle, expectedPublisher, expectedSeries, expectedIssueNumber, expectedQty, expectedPrice);

        Integer actualId = testCard.getId();
        String actualTitle = testCard.getTitle();
        String actualPublisher = testCard.getPublisher();
        String actualSeries = testCard.getSeries();
        Integer actualIssueNumber = testCard.getIssueNumber();
        Integer actualQty = testCard.getQty();
        Float actualPrice = testCard.getPrice();

        Assert.assertEquals(Integer.class.getName(), actualId.getClass().getName());
        Assert.assertEquals(expectedTitle,actualTitle);
        Assert.assertEquals(expectedPublisher,actualPublisher);
        Assert.assertEquals(expectedSeries,actualSeries);
        Assert.assertEquals(expectedIssueNumber,actualIssueNumber);
        Assert.assertEquals(expectedQty,actualQty);
        Assert.assertEquals(expectedPrice,actualPrice);
    }



}
