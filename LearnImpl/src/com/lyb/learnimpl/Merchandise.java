package com.lyb.learnimpl;

public class Merchandise {
    // 商品名称
    private String name;
    // 商品编号
    private String id;
    // 商品价格
    private double price;
    // 商品库存
    private int stock;
    // 不可变
    private final String productType = "Merchandise";
    // 无参构造函数
    public Merchandise() {
    }

    // 有参构造函数
    public Merchandise(String name, String id, double price, int stock) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    // 重写toString方法，方便打印商品信息
    @Override
    public String toString() {
        return "Merchandise{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

    public static void staticMethod(){
        System.out.println("staticMethod in Merchandise");
    }
}
