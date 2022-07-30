package io;

public class SneakerInputCapture extends ProductInputCapture {

    public String enterSneakerSport() {
        System.out.print("Enter Sport: ");
        stringCapture = sc.nextLine();

        return stringCapture;
    }

    public Double enterSneakerSize() {
        System.out.print("Enter Size: ");
        doubleCapture = sc.nextDouble();

        return doubleCapture;
    }

}
