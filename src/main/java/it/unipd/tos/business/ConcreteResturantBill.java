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
        for(MenuItem item : itemsOrdered) {
            result += item.getPrice();
        }
        return result;
    }

}
