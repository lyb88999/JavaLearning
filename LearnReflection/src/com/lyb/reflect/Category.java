package com.lyb.reflect;

public enum Category {
    FOOD(1),
    COOK(3),
    SNACK(5),
    CLOTHES(7),
    ELECTRONIC(9);

    private int id;

    Category(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                '}';
    }
}
