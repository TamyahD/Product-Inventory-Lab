package io;

public class Console {

    public void printWelcome() {
        System.out.println("" +
                "**************************************************" +
                "\n***           Welcome and Bienvenue            ***" +
                "\n***                    to                      ***" +
                "\n***          ZipCo Inventory Manager           ***" +
                "\n**************************************************");
    }

    public void menuOption() {
        System.out.println(
                "\nChoose what to do:" +
                "\n(1)Create new product" +
                "\n(2)Read existing products" +
                "\n(3)Update product" +
                "\n(3)Delete product" +
                "\n(3Get product report)" +
                "\n(4 or q)Exit program");
//                "\n(2)Whiskey\t\t (3)Video Game");
    }


    public void selectProduct() {
        System.out.println("\n" +
                "\n\t\t\t\tChoose Product" +
                "\n(1)Sneaker\t\t (2)Whiskey\t\t (3)Video Game");
    }
}
