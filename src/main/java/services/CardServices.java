package services;

import models.Card;

import java.util.ArrayList;

public class CardServices {
    public static Integer nextId = 1;
    private ArrayList<Card> cardInventory = new ArrayList<>();

    public Card create(String name, String game, String expansion, Integer qty, Float price){
        Card createdCard = new Card(nextId++, name, game, expansion,qty, price);
        cardInventory.add(createdCard);
        return createdCard;
    }

    public Card findCard(Integer id){
        for(Card c : cardInventory){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }

    public Card[] findAll(){
        return cardInventory.toArray(new Card[0]);
    }

    public Boolean delete(Integer id) {
        if(cardInventory.contains(findCard(id))) {
            cardInventory.remove(findCard(id));
            return true;
        }
        return false;
    }

    public static void setNextId(Integer nextId) {
        CardServices.nextId = nextId;
    }
}

