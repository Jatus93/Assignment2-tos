////////////////////////////////////////////////////////////////////
// [Gianmarco] [Pettinato] [1068299] 
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business.exception;

public class RestaurantBillException extends Exception {
    
    public RestaurantBillException(String message) {
        super(message);
    }
    
    public String getMessage() {
        return super.getMessage();
    }
}
