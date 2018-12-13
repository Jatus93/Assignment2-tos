////////////////////////////////////////////////////////////////////
// [Gianmarco] [Pettinato] [1068299] 
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

public class MenuItem {
    public enum TypeElement{
        Primo, Pizza;
    }

    private TypeElement itemType;
    private String name;
    private double price;

    public MenuItem (TypeElement type, String name, double price) {
        this.itemType = type;
        this.name = name;
        this.price = price;
    }

    public TypeElement getType() {
        return itemType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }	
}
