package services;

import models.Card;

import java.util.ArrayList;

public class CardServices {
    public static Integer nextId = 1;

    private ArrayList<Card> inventory = new ArrayList<>();

    public Card create(String name, String game, String expansion, Integer qty, Float price){
        Card createdCard = new Card(nextId++, name, game, expansion,qty, price);
        inventory.add(createdCard);
        return createdCard;
    }

    public Card findCard(Integer id){
        return inventory.get(id);
    }

    public Card[] findAll(){
        return (Card[]) inventory.toArray();
    }

    public Boolean delete(Integer id){
        return inventory.remove(id);
    }
}

