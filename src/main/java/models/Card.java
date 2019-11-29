package models;

import java.util.Objects;

public class Card implements Comparable<Card>{

    private Integer id;
    private String name;
    private String game;
    private String expansion;
    private Integer qty;
    private Float price;

    public Card(){

    }

    public Card(Integer id, String name, String game, String expansion, Integer qty, Float price) {
        this.id = id;
        this.name = name;
        this.game = game;
        this.expansion = expansion;
        this.qty = qty;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public int compareTo(Card o) {
        return this.getId() - o.getId();
    }
}
