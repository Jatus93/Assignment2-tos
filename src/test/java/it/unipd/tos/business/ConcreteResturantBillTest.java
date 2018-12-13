////////////////////////////////////////////////////////////////////
// [Gianmarco] [Pettinato] [1068299] 
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;

public class ConcreteResturantBillTest extends ConcreteResturantBill {

    private ConcreteResturantBill bill = new ConcreteResturantBill();


    @Test
    public void testGetOrderPriceBasic() throws RestaurantBillException {
        List<MenuItem> order = new ArrayList<MenuItem>();
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Margherita",4.50));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Primo,"Carbonara",7.00));
        order.add(new MenuItem(MenuItem.TypeElement.Primo,"Amatriciana",7.00));
        assertEquals(24.50, bill.getOrderPrice(order),0);
    }
    @Test
    public void testGetOrerPriceDiscountCheaperPizza() throws RestaurantBillException {
        List<MenuItem> order = new ArrayList<MenuItem>();
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Marinara",4.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"QuattroFormaggi",8.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"QuattroStagioni",7.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Margherita",4.50));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Viennese",5.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"QuattroFormaggi",8.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"QuattroStagioni",7.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Margherita",4.50));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        assertEquals(62,bill.getOrderPrice(order),0);
    }
    @Test
    public void testGetOrerPriceDiscountOnTotal() throws RestaurantBillException{
        List<MenuItem> order = new ArrayList<MenuItem>();
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Margherita",4.50));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Primo,"Carbonara",7.00));
        order.add(new MenuItem(MenuItem.TypeElement.Primo,"Amatriciana",7.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Margherita",4.50));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Primo,"Carbonara",7.00));
        order.add(new MenuItem(MenuItem.TypeElement.Primo,"Norma",15.00));
        order.add(new MenuItem(MenuItem.TypeElement.Primo,"Amatriciana",7.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Margherita",4.50));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Primo,"Carbonara",7.00));
        order.add(new MenuItem(MenuItem.TypeElement.Primo,"Amatriciana",7.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Margherita",4.50));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Primo,"Carbonara",7.00));
        order.add(new MenuItem(MenuItem.TypeElement.Primo,"Amatriciana",7.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Margherita",4.50));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"QuattroFormaggi",8.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"QuattroStagioni",7.00));
        assertEquals(121.6, bill.getOrderPrice(order),0);
    }
    
    @Test
    public void testGetOrerPriceError() throws RestaurantBillException{
        List<MenuItem> order = new ArrayList<MenuItem>();
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Margherita",4.50));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        order.add(new MenuItem(MenuItem.TypeElement.Pizza,"Diavola",6.00));
        try{
            bill.getOrderPrice(order);
            fail("Ecceccione non lanciata");
        }catch(RestaurantBillException e) {
            assertEquals("Sono stati ordinati almeno 20 elementi "+order.size(), e.getMessage());
        }
    }

}
