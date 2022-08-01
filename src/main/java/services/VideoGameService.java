package services;

import models.Product;
import models.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class VideoGameService implements ProductService{
    private static int nextId=300;
    private List<VideoGame> videoGameList = new ArrayList<>();

    public VideoGame create(String gameTitle, String consoleType, String format,
                            Double price, Integer stock) {
        if (videoGameList.size()==0) {
            nextId=300;
        }
        VideoGame createdGame = new VideoGame(nextId++, gameTitle, consoleType, format, price, stock);
        videoGameList.add(createdGame);

        return createdGame;
    }


    @Override
    public Product findProduct(int id) {
        return null;
    }

    @Override
    public Product[] findAll() {
        return new Product[0];
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
