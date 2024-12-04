package org.example.lifecycle;

public class Pepsi {
    private double price;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Inside Init method");
    }

    public void destroy(){
        System.out.println("Inside destroy method");
    }
}
