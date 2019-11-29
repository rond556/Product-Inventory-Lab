import io.Console;
import models.Card;
import services.CardServices;

import java.util.ArrayList;

public class MainMenu {
    private Boolean running = true;
    Console console = new Console(System.in, System.out);
    CardServices cardServices = new CardServices();
    private ArrayList<Card> cardInventory = new ArrayList<>();

    public void launchMainMenu(){
        while(running) {
            Console.printMainMenu();
            Integer input = console.getIntegerInput(":");
            mainMenuLogic(input);
        }
    }

    public void mainMenuLogic(Integer input){
        switch(input){
            case 1:
                createNewCard();
                break;
            case 2:
                readExistingCard();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }
     public void createNewCard(){
         System.out.println("Please enter the card's name.");
         String cardName = console.getStringInput(":");
         System.out.println("Please enter the card's game.");
         String cardGame = console.getStringInput(":");
         System.out.println("Please enter the card's expansion.");
         String cardExpansion = console.getStringInput(":");
         System.out.println("Please enter how many cards you are entering.");
         Integer numberOfCards = console.getIntegerInput(":");
         System.out.println("Please give this card a price.");
         Double price = console.getDoubleInput(":");
         Card newCard = cardServices.create(cardName,cardGame,cardExpansion,numberOfCards,price);
         if(cardInventory.contains(newCard.getName())){
             System.out.println("Sorry, that card is already in the database.");
         }
         else {
             cardInventory.add(newCard);
             System.out.println(newCard.getName() + " has been added to the database.");
         }
    }

    public void readExistingCard(){
        Card card;
        System.out.println("Please enter the name of the card you are looking for.");
        Integer id = console.getIntegerInput(":");
        card = cardServices.findCard(id);
        if(cardInventory.contains(card)) {
            System.out.println(String.format("Name: %s\n" +
                    "Game: %s\n" +
                    "Expansion: %s\n" +
                    "Quantity: %d\n" +
                    "Price: $%.2f\n", card.getName(), card.getGame(), card.getExpansion(), card.getQty(), card.getPrice()));
        } else {
            System.out.println("Sorry, that id is not in the database.");
        }
    }
}
