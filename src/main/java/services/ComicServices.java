package services;

import models.Comic;

import java.util.ArrayList;

public class ComicServices {

    public static Integer nextId = 1;

    private ArrayList <Comic> inventory = new ArrayList<>();

    public Comic create(String title, String publisher, String series, Integer issueNumber, Integer qty, Float price){
        Comic createdComic = new Comic(nextId++, title, publisher, series, issueNumber, qty, price);
        inventory.add(createdComic);
        return createdComic;
    }

    public Comic findComic(Integer id){
        return inventory.get(id);
    }

    public Comic[] findAll(){
        return (Comic[]) inventory.toArray();
    }

    public Boolean delete(Integer id){
        return inventory.remove(id);
    }
}
