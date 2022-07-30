package models;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WhiskeyTest {
    Whiskey whiskey;

    @Before
    public void testCreateWhiskey() {
        whiskey = new Whiskey("Jameson", "Irish Whiskey", 25.00, 1234550, 7);
    }


    @Test
    public void getWhiskeyBrand() {
        // Given
        String expectedWhiskeyBrand = "Jameson";
        // When
        String actualWhiskeyBrand = whiskey.getBrand();
        // Then
        assertSame(expectedWhiskeyBrand, actualWhiskeyBrand);
    }

    @Test
    public void setWhiskeyBrand() {
        // Given
        whiskey.setBrand("Elijah Craig");
        // When
        String expectedWhiskeyBrand = "Elijah Craig";
        String actualWhiskeyBrand = whiskey.getBrand();
        // Then
        assertSame(expectedWhiskeyBrand, actualWhiskeyBrand);
    }

    @Test
    public void getWhiskeyName() {
        // Given
        String expectedWhiskeyName = "Irish Whiskey";
        // When
        String actualWhiskeyName = whiskey.getName();
        // Then
        assertSame(expectedWhiskeyName, actualWhiskeyName);
    }

    @Test
    public void setWhiskeyName() {
        // Given
        whiskey.setName("Small Batch");
        // When
        String expectedWhiskeyName = "Small Batch";
        String actualWhiskeyName = whiskey.getName();
        // Then
        assertSame(expectedWhiskeyName, actualWhiskeyName);
    }

    @Test
    public void getWhiskeyPrice() {
        // Given
        Double expectedWhiskeyPrice = 25.00;
        // When
        Double actualWhiskeyPrice = whiskey.getPrice();
        // Then
        assertEquals(expectedWhiskeyPrice, actualWhiskeyPrice);
    }

    @Test
    public void setWhiskeyPrice() {
        // Given
        whiskey.setPrice(17.99);
        // When
        Double expectedWhiskeyName = 17.99;
        Double actualWhiskeyName = whiskey.getPrice();
        // Then
        assertEquals(expectedWhiskeyName, actualWhiskeyName);
    }

    @Test
    public void getWhiskeyId() {
        // Given
        Integer expectedWhiskeyId = 1234550;
        // When
        Integer actualWhiskeyId = whiskey.getId();
        // Then
        assertEquals(expectedWhiskeyId, actualWhiskeyId);
    }

    @Test
    public void setWhiskeyId() {
        // Given
        whiskey.setId(1234525);
        // When
        Integer expectedWhiskeyId = 1234525;
        Integer actualWhiskeyId = whiskey.getId();
        // Then
        assertEquals(expectedWhiskeyId, actualWhiskeyId);
    }

    @Test
    public void getWhiskeyStock() {
        // Given
        Integer expectedWhiskeyStock = 7;
        // When
        Integer actualWhiskeyStock = whiskey.getStock();
        // Then
        assertEquals(expectedWhiskeyStock, actualWhiskeyStock);
    }

    @Test
    public void setWhiskeyStock() {
        // Given
        whiskey.setStock(31);
        // When
        Integer expectedWhiskeyStock = 31;
        Integer actualWhiskeyStock = whiskey.getStock();
        // Then
        assertEquals(expectedWhiskeyStock, actualWhiskeyStock);
    }
}
