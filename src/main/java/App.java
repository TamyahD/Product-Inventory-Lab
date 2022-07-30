import io.Console;
import io.SneakerInputCapture;
import io.ProductInputCapture;
import services.SneakerService;

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
    SneakerService sneakerService = new SneakerService();
    Console console = new Console();

    public static void main(String[] args) {
        App application = new App();
        application.init();
    }

    public void init() {
        console.printWelcome();
        console.menuOption();
        String input = productInputCapture.captureInput();
        if (input.equals("1")) {
            console.selectProduct();

            switch (input) {
                case "1":
                    String brand = productInputCapture.enterProductBrand();
                    String name = productInputCapture.enterProductName();
                    String sport = sneakerInputCapture.enterSneakerSport();
                    Double price = productInputCapture.enterProductPrice();
                    Double size = sneakerInputCapture.enterSneakerSize();
                    Integer stock = productInputCapture.enterProductStock();

                    sneakerService.create(name, brand, sport, size, stock, price);
                    break;
                case "2":
                    System.out.println("typed " +input);
                    break;
                case "3":
                    System.out.println("typed " +input);
                    break;
                default:
                    System.out.println("invalid input".toUpperCase());
            }
        }
        else if (input.equals("2")) {
            System.out.println("you chosed menu option 2");
        }
        else if (input.equals("3")) {
            System.out.println("you chosed menu option 3");
        }
        else if (input.equals("4")) {
            System.out.println("you chosed menu option 4");
        }
        else if (input.equals("5")) {
            System.out.println("you chosed menu option 5");
        }
    }
}
