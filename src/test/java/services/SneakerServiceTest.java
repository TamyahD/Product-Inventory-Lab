package services;

import models.Sneaker;
import org.junit.Test;
import static org.junit.Assert.*;

public class SneakerServiceTest {
    @Test
    public void testCreateSneaker() {
//        Integer expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        Double expectedSize = 10.5;
        Integer expectedStock = 10;
        Double expectedPrice = 80.00;

        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.create(expectedName, expectedBrand, expectedSport,
                                                        expectedSize, expectedStock, expectedPrice);

        Integer actualId = testSneaker.getId();
        String actualName = testSneaker.getItemName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        Double actualSize = testSneaker.getSize();
        Integer actualStock = testSneaker.getStock();
        Double actualPrice = testSneaker.getPrice();

        assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        assertSame(expectedName, actualName);
        assertSame(expectedBrand, actualBrand);
        assertSame(expectedSport, actualSport);
//        assertEquals(expectedId, actualId);
        assertEquals(expectedPrice, actualPrice);
        assertEquals(expectedSize, actualSize);
        assertEquals(expectedStock, actualStock);
    }

}