package io;

import java.util.Scanner;

/*
* gather user input
* gather output
*
*
*/
public abstract class ProductInputCapture {
    Scanner sc = new Scanner(System.in);
    String stringCapture;
    Double doubleCapture;
    Integer integerCapture;

//    public void printWelcome() {
//        System.out.println("" +
//                "**************************************************" +
//                "\n***           Welcome and Bienvenue            ***" +
//                "\n***                    to                      ***" +
//                "\n***          ZipCo Inventory Manager           ***" +
//                "\n**************************************************");
//    }

//    public void selectProduct() {
//        System.out.println("\n" +
//                "\n\t\t\t\tChoose Product" +
//                "\n(1)Sneaker\t\t (2)Whiskey\t\t (3)Video Game");
//    }

    public String enterProductBrand() {
        System.out.print("Enter Brand: ");
        stringCapture = sc.nextLine();
        return stringCapture;
    }


    public String captureInput() {
        /* FIXME adjust method to properly capture user input
            according to product inventory program
        */
        String message = "";
        System.out.print(message);
        stringCapture = sc.nextLine();

        return stringCapture;
    }

    public void displayOutput() {

    }

    public String enterProductName() {
        System.out.print("Enter Name of Product: ");
        stringCapture = sc.nextLine();

        return stringCapture;
    }

//    public String enterSneakerSport() {
//        System.out.print("Enter Product Sport: ");
//        stringCapture = sc.nextLine();
//
//        return stringCapture;
//    }

    public Double enterProductPrice() {
        System.out.print("Enter Price: ");
        doubleCapture = sc.nextDouble();

        return doubleCapture;
    }

    public Integer enterProductStock() {
        System.out.print("Enter Quantity: ");
        integerCapture = sc.nextInt();

        return integerCapture;
    }
}
