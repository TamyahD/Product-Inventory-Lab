package models;

import models.Sneaker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SneakerTest {
    Sneaker airMax;

    @Before
    public void testCreateAirMaxSneaker() {
        airMax  = new Sneaker("Nike Air Max", 120.00, "sr12345", 18);
    }

    @Test
    public void testGetAirMaxName() {
        // Given
        String expectedAirMaxName = "Nike Air Max";
        // When
        String actualAirMaxName = airMax.getItemName();
        // Then
        assertSame(expectedAirMaxName, actualAirMaxName);
    }

    @Test
    public void testSetAirMaxName() {
        // Given
        airMax.setItemName("Nike Air Max 97");
        // When
        String expectedAirMaxName = "Nike Air Max 97";
        String actualAirMaxName = airMax.getItemName();
        // Then
        assertSame(expectedAirMaxName, actualAirMaxName);
    }

    @Test
    public void testGetAirMaxPrice() {
        // Given
        Double expectedAirMaxPrice = 120.00;
        // When
        Double actualAirMaxPrice = airMax.getPrice();
        // Then
        assertEquals(expectedAirMaxPrice, actualAirMaxPrice);
    }

    @Test
    public void testSetAirMaxPrice() {
        // Given
        airMax.setPrice(150.00);
        // When
        Double expectedAirMaxPrice = 150.00;
        Double actualAirMaxPrice = airMax.getPrice();
        // Then
        assertEquals(expectedAirMaxPrice, actualAirMaxPrice);
    }

    @Test
    public void testGetAirMaxId() {
        // Given
        String expectedAirMaxId = "sr12345";
        // When
        String actualAirMaxId = airMax.getId();
        // Then
        assertSame(expectedAirMaxId, actualAirMaxId);
    }

    @Test
    public void testSetAirMaxId() {
        // Given
        airMax.setId("sr1234597");
        // When
        String expectedAirMaxPrice = "sr1234597";
        String actualAirMaxPrice = airMax.getId();
        // Then
        assertSame(expectedAirMaxPrice, actualAirMaxPrice);
    }

    @Test
    public void testGetAirMaxStock() {
        // Given
        Integer expectedAirMaxStock = 18;
        // When
        Integer actualAirMaxStock = airMax.getStock();
        // Then
        assertEquals(expectedAirMaxStock, actualAirMaxStock);
    }

    @Test
    public void testSetAirMaxStock() {
        // Given
        airMax.setStock(75);
        // When
        Integer expectedAirMaxStock = 75;
        Integer actualAirMaxStock = airMax.getStock();
        // Then
        assertSame(expectedAirMaxStock, actualAirMaxStock);
    }
}