import io.Console;
import io.SneakerInputCapture;
import io.ProductInputCapture;
import io.VideoGameInputCapture;
import services.SneakerService;
import services.VideoGameService;
import services.WhiskeyService;

public class App {
    /* TODO LIST:
    * TODO create different products,
    * TODO add products to inventory
    * TODO read from existing products
    * TODO update products
    * TODO delete products
    * TODO get different reports about products
    * TODO exit program
    */
    ProductInputCapture productInputCapture = new SneakerInputCapture();
    SneakerInputCapture sneakerInputCapture = new SneakerInputCapture();
    VideoGameInputCapture videoGameInputCapture = new VideoGameInputCapture();
    SneakerService sneakerService = new SneakerService();
    WhiskeyService whiskeyService = new WhiskeyService();
    VideoGameService gameService = new VideoGameService();
    Console console = new Console();

    public static void main(String[] args) {
        App application = new App();
        application.init();
    }

    public void init() {
        console.printWelcome();
        console.menuOption();
        String menuOption = productInputCapture.captureInput();
        if (menuOption.equals("1")) {
            console.selectProduct();
            String input = productInputCapture.captureInput();
            switch (input) {
                case "1":
//                    String brand = productInputCapture.enterProductBrand();
//                    String name = productInputCapture.enterProductName();
//                    String sport = sneakerInputCapture.enterSneakerSport();
//                    Double price = productInputCapture.enterProductPrice();
//                    Double size = sneakerInputCapture.enterSneakerSize();
//                    Integer stock = productInputCapture.enterProductStock();
                    System.out.println("Creating New Whiskey...");
                    sneakerService.create(
                            productInputCapture.enterProductName(),
                            productInputCapture.enterProductBrand(),
                            sneakerInputCapture.enterSneakerSport(),
                            sneakerInputCapture.enterSneakerSize(),
                            productInputCapture.enterProductStock(),
                            productInputCapture.enterProductPrice());
                    System.out.println("New sneaker added to sneaker inventory!");
                    break;
                case "2":
                    System.out.println("Creating New Whiskey...");
                    whiskeyService.create(
                            productInputCapture.enterProductBrand(),
                            productInputCapture.enterProductName(),
                            productInputCapture.enterProductPrice(),
                            productInputCapture.enterProductStock());
                    System.out.println("New whiskey added to whiskey inventory!");
                    break;
                case "3":
                    System.out.println("Creating New Video Game...");
                    gameService.create(
                            videoGameInputCapture.enterGameTitle(),
                            videoGameInputCapture.enterGameConsoleType(),
                            videoGameInputCapture.enterGameFormat(),
                            productInputCapture.enterProductPrice(),
                            productInputCapture.enterProductStock());
                    System.out.println("New video game added to video game inventory!");
                    break;
                default:
                    System.out.println("invalid input".toUpperCase());
            }
        }
        else if (menuOption.equals("2")) {
            System.out.println("you chosed menu option 2");
            System.out.println("Sneaker Inventory: " +sneakerService.getSneakerInventory().size());
            System.out.println("Whiskey Inventory: " +whiskeyService.getWhiskeyInventory().size());
//            System.out.println("Sneaker Inventory: " +.getSneakerInventory());
        }
        else if (menuOption.equals("3")) {
            System.out.println("you chosed menu option 3");
        }
        else if (menuOption.equals("4")) {
            System.out.println("you chosed menu option 4");
        }
        else if (menuOption.equals("5")) {
            System.out.println("you chosed menu option 5");
        }
    }
}
