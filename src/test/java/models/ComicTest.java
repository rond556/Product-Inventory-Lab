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
    public void consructorTest(){

    }
}
