package com.geekbang.supermarket;

public class Merchandise {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;


    @Override
    public String toString() {
        return "Merchandise{" +
                "soldPrice=" + soldPrice +
                ", name='" + name + '\'' +
                '}';
    }
}
