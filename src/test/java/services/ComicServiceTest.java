package services;

import models.Comic;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ComicServiceTest {
    ComicServices comicServices = new ComicServices();
    private ArrayList<Comic> comicInventory = new ArrayList<>();

    @Before
    public void setUp(){
        Comic batmanYearOne = comicServices.create("Batman: Year One","DC Comics","Batman",1,10, 7.99F);
        Comic theAmaingSpiderMan = comicServices.create("The Amazing Spider-man", "Marvel", "Spider-man", 14,19, 3.99F);
        Comic shadowOfTheEmpire = comicServices.create("Shadow of the Empire", "Dark Horse", "Star Wars", 2, 4, 4.99F);
        comicInventory.add(batmanYearOne);
        comicInventory.add(theAmaingSpiderMan);
        comicInventory.add(shadowOfTheEmpire);
    }

    @Test
    public void createTest() {
        String expectedTitle = "Batman: Year One";
        String expectedPublisher = "DC Comics";
        String expectedSeries = "Batman";
        Integer expectedIssueNumber = 1;
        Integer expectedQty = 10;
        Float expectedPrice = 6.75F;

        ComicServices comicServices = new ComicServices();
        Comic testComic = comicServices.create(expectedTitle, expectedPublisher, expectedSeries, expectedIssueNumber, expectedQty, expectedPrice);

        Integer actualId = testComic.getId();
        String actualTitle = testComic.getTitle();
        String actualPublisher = testComic.getPublisher();
        String actualSeries = testComic.getSeries();
        Integer actualIssueNumber = testComic.getIssueNumber();
        Integer actualQty = testComic.getQty();
        Float actualPrice = testComic.getPrice();

        Assert.assertEquals(Integer.class.getName(), actualId.getClass().getName());
        Assert.assertEquals(expectedTitle,actualTitle);
        Assert.assertEquals(expectedPublisher,actualPublisher);
        Assert.assertEquals(expectedSeries,actualSeries);
        Assert.assertEquals(expectedIssueNumber,actualIssueNumber);
        Assert.assertEquals(expectedQty,actualQty);
        Assert.assertEquals(expectedPrice,actualPrice);
    }

    @Test
    public void findTest(){
        Comic expected = comicServices.create("Batman: Year One","DC Comics","Batman",1,10, 7.99F);
        Comic actual = comicServices.findComic(1);
        Assert.assertEquals(expected.getTitle(),actual.getTitle());

    }

    @Test
    public void findTest2(){
        Comic expected = comicServices.create("Shadow of the Empire", "Dark Horse", "Star Wars", 2, 4, 4.99F);
        Comic actual = comicServices.findComic(3);

        Assert.assertEquals(expected.getTitle(),actual.getTitle());
    }

    @Test
    public void findAllTest(){
        Collections.sort(comicInventory);
        Comic[] expected = comicInventory.toArray(new Comic[0]);
        Comic[] actual = comicServices.findAll();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void deleteTest(){
        Integer id = 1;
        Boolean result = comicServices.delete(id);
        Assert.assertTrue(result);
        Assert.assertFalse(comicInventory.contains(comicServices.findComic(id)));
    }

    @After
    public void tearDown(){
        ComicServices.setNextId(1);
        comicInventory.clear();
    }


}
