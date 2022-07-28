import org.junit.Before;

import static org.junit.Assert.*;

public class ProductTest {
    Product book;
    @Before
    public void testCreateProduct() {
        book = new Product("Head First Java", 16.00,
                "bk12345", 3);
    }


    @org.junit.Test
    public void getItemName() {
        // Given
        String expectedItemName = "Head First Java";
        // When
        String actualItemName = book.getItemName();
        // Then
        assertSame(expectedItemName, actualItemName);
    }

    @org.junit.Test
    public void setItemName() {
        // Given
        book.setItemName("Head First Java 3rd Edition");
        // When
        String expectedItemName = "Head First Java 3rd Edition";
        String actualItemName = book.getItemName();
        // Then
        assertSame(expectedItemName, actualItemName);
    }

    @org.junit.Test
    public void getPrice() {
        // Given
        Double expectedProductPrice = 16.00;
        // When
        Double actualProductPrice = book.getPrice();
        // Then
        assertEquals(expectedProductPrice, actualProductPrice);
    }

    @org.junit.Test
    public void setPrice() {
        // Given
        book.setPrice(23.00);
        // When
        Double expectedProductPrice = 23.00;
        Double actualProductPrice = book.getPrice();
        // Then
        assertEquals(expectedProductPrice, expectedProductPrice);
    }

    @org.junit.Test
    public void getId() {
        // Given
        String expectedProductId = "bk12345";
        // When
        String actualProductId = book.getId();
        // Then
        assertSame(expectedProductId, actualProductId);
    }

    @org.junit.Test
    public void setId() {
        // Given
        book.setId("bk1234503");
        // When
        String expectedProductId = "bk1234503";
        String actualProductId = book.getId();
        // Then
        assertSame(expectedProductId, actualProductId);
    }

    @org.junit.Test
    public void getStock() {
        // Given
        Integer expectedProductStock = 3;
        // When
        Integer actualProductStock = book.getStock();
        // Then
        assertEquals(expectedProductStock, actualProductStock);
    }

    @org.junit.Test
    public void setStock() {
        // Given
        book.setStock(100);
        // When
        Integer expectedProductStock = 100;
        Integer actualProductStock = book.getStock();
        // Then
        assertEquals(expectedProductStock, actualProductStock);
    }
}