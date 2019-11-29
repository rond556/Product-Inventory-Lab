package services;

import models.Comic;

import java.util.ArrayList;

public class ComicServices {
    public static Integer nextId = 1;
    private ArrayList <Comic> comicInventory = new ArrayList<>();

    public Comic create(String title, String publisher, String series, Integer issueNumber, Integer qty, Float price){
        Comic createdComic = new Comic(nextId++, title, publisher, series, issueNumber, qty, price);
        comicInventory.add(createdComic);
        return createdComic;
    }

    public Comic findComic(Integer id){
        for(Comic c : comicInventory){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }

    public Comic[] findAll(){
        return comicInventory.toArray(new Comic[0]);
    }

    public Boolean delete(Integer id){
        if(comicInventory.contains(findComic(id))) {
            comicInventory.remove(findComic(id));
            return true;
        }
        return false;
    }

    public static void setNextId(Integer nextId) {
        ComicServices.nextId = nextId;
    }
}
