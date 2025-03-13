package org.example.model;

public class Chocolate extends ProductForSale{
    private double calorie;
    private int quantity;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, double calorie, int quantity) {
        super(type, price, description);
        this.calorie = calorie;
        this.quantity = quantity;
    }

    @Override
    public double getSalesPrice(int quantity) {
        this.quantity = quantity;
        return quantity * getPrice();
    }

    @Override
    public void showDetails() {
        double totalPrice = getSalesPrice(quantity);
        System.out.println("Chocolate{" + "total price=" +  totalPrice+
                ", calorie=" + calorie +
                "} " + super.toString());
    }
}
