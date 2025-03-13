package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale product1 = new Bread("Tam Buğday", 19.99 , "Tam buğday unundan yapılmıştır.", 140.5, 3);
        ProductForSale product2 = new Chocolate("Antep Fıstıklı", 40.75, "Bol antep fıstıklı nefis çikolata..", 250.65, 5);
        ProductForSale product3 = new Coke("Zero", 25.99, "Sıfır şekerli cola.", 180.1, 1);

        ProductForSale[] products = new ProductForSale[]{product1, product2, product3};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(int i = 0; i < products.length; i++){
            products[i].showDetails();
        }
    }
}