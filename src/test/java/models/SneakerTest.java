package models;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SneakerTest {
    Sneaker sneaker;

    @Before
    public void testCreateAirMaxSneaker() {
        sneaker = new Sneaker("Nike","Air Max", 120.00, 12345, 8.5, 18);
    }

    @Test
    public void testGetAirMaxBrand() {
        // Given
        String expectedAirMaxBrand = "Nike";
        // When
        String actualAirMaxBrand= sneaker.getBrand();
        // Then
        assertSame(expectedAirMaxBrand, actualAirMaxBrand);
    }

    @Test
    public void testSetAirMaxBrand() {
        // Given
        sneaker.setBrand("Air Jordan");
        // When
        String expectedAirMaxBrand = "Air Jordan";
        String actualAirMaxBrand = sneaker.getBrand();
        // Then
        assertSame(expectedAirMaxBrand, actualAirMaxBrand);
    }


    @Test
    public void testGetAirMaxName() {
        // Given
        String expectedAirMaxName = "Air Max";
        // When
        String actualAirMaxName = sneaker.getItemName();
        // Then
        assertSame(expectedAirMaxName, actualAirMaxName);
    }

    @Test
    public void testSetAirMaxName() {
        // Given
        sneaker.setItemName("Nike Air Max 97");
        // When
        String expectedAirMaxName = "Nike Air Max 97";
        String actualAirMaxName = sneaker.getItemName();
        // Then
        assertSame(expectedAirMaxName, actualAirMaxName);
    }

    @Test
    public void testGetAirMaxPrice() {
        // Given
        Double expectedAirMaxPrice = 120.00;
        // When
        Double actualAirMaxPrice = sneaker.getPrice();
        // Then
        assertEquals(expectedAirMaxPrice, actualAirMaxPrice);
    }

    @Test
    public void testSetAirMaxPrice() {
        // Given
        sneaker.setPrice(150.00);
        // When
        Double expectedAirMaxPrice = 150.00;
        Double actualAirMaxPrice = sneaker.getPrice();
        // Then
        assertEquals(expectedAirMaxPrice, actualAirMaxPrice);
    }

    @Test
    public void testGetAirMaxId() {
        // Given
        Integer expectedAirMaxId = 12345;
        // When
        Integer actualAirMaxId = sneaker.getId();
        // Then
        assertEquals(expectedAirMaxId, actualAirMaxId);
    }

    @Test
    public void testSetAirMaxId() {
        // Given
        sneaker.setId(1234597);
        // When
        Integer expectedAirMaxPrice = 1234597;
        Integer actualAirMaxPrice = sneaker.getId();
        // Then
        assertEquals(expectedAirMaxPrice, actualAirMaxPrice);
    }

    @Test
    public void testGetAirMaxSize() {
        // Given
        Double expectedAirMaxSize = 8.5;
        // When
        Double actualAirMaxSize = sneaker.getSize();
        // Then
        assertEquals(expectedAirMaxSize, actualAirMaxSize);
    }

    @Test
    public void testSetAirMaxSize() {
        // Given
        sneaker.setSize(7.0);
        // When
        Double expectedAirMaxSize = 7.0;
        Double actualAirMaxSize = sneaker.getSize();
        // Then
        assertEquals(expectedAirMaxSize, actualAirMaxSize);
    }

    @Test
    public void testGetAirMaxStock() {
        // Given
        Integer expectedAirMaxStock = 18;
        // When
        Integer actualAirMaxStock = sneaker.getStock();
        // Then
        assertEquals(expectedAirMaxStock, actualAirMaxStock);
    }

    @Test
    public void testSetAirMaxStock() {
        // Given
        sneaker.setStock(75);
        // When
        Integer expectedAirMaxStock = 75;
        Integer actualAirMaxStock = sneaker.getStock();
        // Then
        assertSame(expectedAirMaxStock, actualAirMaxStock);
    }
}