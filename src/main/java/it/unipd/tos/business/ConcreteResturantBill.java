////////////////////////////////////////////////////////////////////
// [Gianmarco] [Pettinato] [1068299] 
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;

public class ConcreteResturantBill implements ResturantBill {

    @Override
    public double getOrderPrice(List<MenuItem> itemsOrdered) throws RestaurantBillException {
        double result = 0;
        int pizzaCounter = 0;
        double cheaperPizza = 0;
        if(itemsOrdered.size()>20) {
            throw new RestaurantBillException("Sono stati ordinati almeno 20 elementi "+itemsOrdered.size());
        }
        for(MenuItem item : itemsOrdered) {
            result += item.getPrice();
            if(item.getType() == MenuItem.TypeElement.Pizza) {
                pizzaCounter++;
                if(cheaperPizza == 0) {
                    cheaperPizza = item.getPrice();
                }
                if(cheaperPizza > item.getPrice()) {
                    cheaperPizza = item.getPrice();
                }
            }
        }
        if(pizzaCounter >= 10) {
            result-=cheaperPizza;
        }        
        if(result >= 100 )
        {
            result-=result*0.05;
        }
        return result;
    }

}
