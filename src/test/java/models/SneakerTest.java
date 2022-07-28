package models;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SneakerTest {
    Sneaker sneaker;
//
//    Integer expectedId = 6;
//    String expectedName = "Stan Smith";
//    String expectedBrand = "Adidas";
//    String expectedSport = "Tennis";
//    Double expectedSize = 10.5;
//    Integer expectedStock = 10;
//    Double expectedPrice = 80.00;
//

    @Test
    public void testConstructor() {
        Integer expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        Double expectedSize = 10.5;
        Integer expectedStock = 10;
        Double expectedPrice = 80.00;

        Sneaker testSneaker = new Sneaker(expectedBrand, expectedName, expectedSport,
                                expectedPrice, expectedId, expectedSize, expectedStock);

        assertEquals(expectedId, testSneaker.getId());
        assertEquals(expectedName, testSneaker.getItemName());
        assertEquals(expectedSport, testSneaker.getSport());
        assertEquals(expectedBrand, testSneaker.getBrand());
        assertEquals(expectedStock, testSneaker.getStock());
        assertEquals(expectedSize, testSneaker.getSize());
    }

/* FIXME this is the correct format of testing setter methods
    * // Given
    * String expected = "sometext";
    * // When
    * testSneaker = new Sneaker();
    * testSneaker.setName(expected)
    * // Then
    * assertEquals(expected, testSneaker.get());
    * */

    @Before
    public void testCreateSneaker() {
        sneaker = new Sneaker("Nike", "Air Max", "running",
                                85.00, 1, 7.5, 9);
    }


    @Test
    public void testGetAirMaxBrand() {
        // Given
        String expected = "Nike";
        // When
        String actual = sneaker.getBrand();
        // Then
        assertSame(expected, actual);
    }


    @Test
    public void testSetAirMaxBrand() {
        // Given
        String expected = "Air Jordan";
        // When
        sneaker.setBrand(expected);
        String actual = sneaker.getBrand();
        // Then
        assertSame(expected, actual);
    }

    @Test
    public void testGetAirMaxName() {
        // Given
        String expected = "Air Max";
        // When
        String actual = sneaker.getItemName();
        // Then
        assertSame(expected, actual);
    }

    @Test
    public void testSetAirMaxName() {
        // Given
        String expected = "Air Max 97";
//        sneaker.setItemName("Nike Air Max 97");
        // When
        sneaker.setItemName(expected);
        String actual = sneaker.getItemName();
        // Then
        assertSame(expected, actual);
    }

    @Test
    public void testGetAirMaxSportType() {
        // Given
        String expected = "running";
        // When
        String actual = sneaker.getSport();
        // Then
        assertSame(expected, actual);
    }

    @Test
    public void testSetAirMaxSportType() {
        // Given
        String expected = "basketball";
        // When
        sneaker.setSport(expected);
        String actual = sneaker.getSport();
        // Then
        assertSame(expected, actual);
    }

    @Test
    public void testGetAirMaxPrice() {
        // Given
        Double expected = 85.00;
        // When
        Double actual = sneaker.getPrice();
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAirMaxPrice() {
        // Given
        Double expected = 150.00;
        // When
        sneaker.setPrice(expected);
        Double actual = sneaker.getPrice();
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAirMaxId() {
        // Given
        Integer expected = 1;
        // When
        Integer actual = sneaker.getId();
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAirMaxId() {
        // Given
        Integer expected = 12;
        // When
        sneaker.setId(expected);
        Integer actual = sneaker.getId();
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAirMaxSize() {
        // Given
        Double expected = 7.5;
        // When
        Double actual = sneaker.getSize();
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAirMaxSize() {
        // Given
        Double expected = 8.0;
        // When
        sneaker.setSize(expected);
        Double actual = sneaker.getSize();
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAirMaxStock() {
        // Given
        Integer expected = 9;
        // When
        Integer actual = sneaker.getStock();
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAirMaxStock() {
        // Given
        Integer expected = 23;
        // When
        sneaker.setStock(expected);
        Integer actual = sneaker.getStock();
        // Then
        assertEquals(expected, actual);
    }
}