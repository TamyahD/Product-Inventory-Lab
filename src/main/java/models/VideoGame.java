package models;

public class VideoGame extends Product{
    private String consoleType;
    private String format;

    /* TODO test cases for VideoGame */
    public VideoGame(String name, Double price, int id,Integer stock,
                     String consoleType, String format) {
        super(name, price, id, stock);
        this.consoleType = consoleType;
        this.format = format;
    }


    public String getConsoleType() {
        return consoleType;
    }

    public void setConsoleType(String consoleType) {
        this.consoleType = consoleType;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
