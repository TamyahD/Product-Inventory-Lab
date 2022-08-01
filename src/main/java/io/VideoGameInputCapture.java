package io;

public class VideoGameInputCapture extends ProductInputCapture{

    public String enterGameTitle() {
        System.out.print("Enter Game Title: ");
        stringCapture = sc.nextLine();

        return stringCapture;
    }

    public String enterGameConsoleType() {
        System.out.print("Enter Console Type: ");
        stringCapture = sc.nextLine();

        return stringCapture;
    }

    public String enterGameFormat() {
        System.out.print("Enter Game Format: ");
        stringCapture = sc.nextLine();

        return stringCapture;

    }


}
