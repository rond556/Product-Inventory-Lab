import io.Console;
import services.CardServices;

public class App {
    private CardServices cardServices = new CardServices();

    public static void main (String... args){
        App application = new App();
        application.init();


    }

    public void init(){
        MainMenu mainMenu = new MainMenu();
        Console.printWelcome();
        mainMenu.launchMainMenu();
    }
}
