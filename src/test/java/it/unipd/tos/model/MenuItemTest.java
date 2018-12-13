package it.unipd.tos.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class MenuItemTest {
    MenuItem item = new MenuItem(MenuItem.TypeElement.Primo,"Spaghetti alla carbonara",10.00);
    @Test
    public void testGetName() {
        assertEquals("Spaghetti alla carbonara", item.getName());
    }
    
    @Test
    public void testGetPrice() {
        assertEquals(10.00, item.getPrice(),0);
    }

}
