package services;

import models.Sneaker;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SneakerServiceTest {
    @Test
    public void testCreateSneaker() {
        // Given
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        Double expectedSize = 10.5;
        Integer expectedStock = 10;
        Double expectedPrice = 80.00;

        // When
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

        // Then
        assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        assertSame(expectedName, actualName);
        assertSame(expectedBrand, actualBrand);
        assertSame(expectedSport, actualSport);
        assertEquals(expectedPrice, actualPrice);
        assertEquals(expectedSize, actualSize);
        assertEquals(expectedStock, actualStock);
    }

    @Test
    public void testFindSneaker() {
        // Given
        SneakerService sneakerService = new SneakerService();
        Sneaker s1 = sneakerService.create("NMD R1", "Adidas", "running",
                6.0, 9, 95.00);
        Sneaker s2 = sneakerService.create("Air Force 1", "Nike", "basketball",
                10.0, 33, 99.99);
        // When
        Sneaker expected = s2;
        Sneaker actual = (Sneaker) sneakerService.findProduct(2);
        // Then
//        System.out.println(actual.getBrand() + " " + actual.getItemName());
        assertSame(expected, actual);
    }

    @Test
    public void testFindAll() {
        // Given
        SneakerService sneakerService = new SneakerService();
        Sneaker s1 = sneakerService.create("NMD R1", "Adidas", "running",
                6.0, 9, 95.00);
        Sneaker s2 = sneakerService.create("Air Force 1", "Nike", "basketball",
                10.0, 33, 99.99);
        Sneaker s3 = sneakerService.create("Astro Kick", "PUMA", "athletic",
                8.5, 5, 45.00);
        Sneaker s4 = sneakerService.create("Classic Slip-On", "Vans", "skate",
                7.0, 18, 60.00);
        // When
        Sneaker[] expectedSneakerArray = (Sneaker[])sneakerService.findAll();
        // Then
        assertSame(expectedSneakerArray[1],s2);
        assertSame(expectedSneakerArray[0].getBrand(),s1.getBrand());
        assertSame(expectedSneakerArray[3].getItemName(),s4.getItemName());
    }

    @Test
    public void testDelete() {
        // Given
        SneakerService sneakerService01 = new SneakerService();

//        for (Sneaker sneak : sneakerService.getSneakerInventory()) {
//            sneakerService.delete(sneak.getId());
//            sneakerService.getSneakerInventory().clear();
//        }
//        sneakerService01.setSneakerInventory(new ArrayList<>());

        Sneaker sneak1 = sneakerService01.create("NMD R1", "Adidas", "running",
                                            6.0, 9, 95.00);
        Sneaker sneak2 = sneakerService01.create("Air Force 1", "Nike", "basketball",
                                            10.0, 33, 99.99);
        Sneaker sneak3 = sneakerService01.create("Astro Kick", "PUMA", "athletic",
                                            8.5, 5, 45.00);
        Sneaker sneak4 = sneakerService01.create("Classic Slip-On", "Vans", "skate",
                                            7.0, 18, 60.00);
        // When
//        System.out.println(sneakerService01.findSneaker(3).getItemName());
        boolean actual = sneakerService01.delete(3);
        // Then
        assertTrue(actual);
        assertEquals(3, sneakerService01.getSneakerInventory().size());
    }

}