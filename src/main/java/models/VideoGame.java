package models;

public class VideoGame extends Product{
    private String consoleType;
    private String format;

    /* TODO test cases for VideoGame */
    public VideoGame(Integer id, String gameTitle, String consoleType, String format,
                     Double price, Integer stock) {
        super(gameTitle, price, id, stock);
        this.consoleType = consoleType;
        this.format = format;
    }
    public VideoGame() {}


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
