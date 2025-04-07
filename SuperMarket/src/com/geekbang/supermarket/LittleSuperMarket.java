package com.geekbang.supermarket;

import java.util.Arrays;

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public Merchandise[] merchandises;
    public int[] merchandiseSold;

    @Override
    public String toString() {
        return "LittleSuperMarket{" +
                "superMarketName='" + superMarketName + '\'' +
                ", address='" + address + '\'' +
                ", parkingCount=" + parkingCount +
                ", incomingSum=" + incomingSum +
                ", merchandises=" + Arrays.toString(merchandises) +
                ", merchandiseSold=" + Arrays.toString(merchandiseSold) +
                '}';
    }
}
