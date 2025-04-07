package com.geekbang;

import com.geekbang.person.Customer;
import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.Merchandise;

import java.util.Scanner;

/**
 * @author yuboli
 */
public class RunLittleSuperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.address = "北京市朝阳区北京工业大学";
        littleSuperMarket.superMarketName = "爱家超市";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandises = new Merchandise[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        Merchandise[] all = littleSuperMarket.merchandises;
        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();
            m.count = 200;
            m.id = "ID" + i;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }
        System.out.println("超市开门啦!");
        boolean open = true;
        Scanner scanner = new Scanner(System.in);

        while (open) {
            System.out.println(littleSuperMarket);

            Customer customer = new Customer();
            customer.name = "顾客编号" + (int) (Math.random() * 10000);
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivingCar = Math.random() > 0.5;
            if (customer.isDrivingCar) {
                if (littleSuperMarket.parkingCount > 0) {
                    System.out.println("欢迎" + customer.name + "驾车而来. 本店已经为您安排了车位, 停车免费.");
                    littleSuperMarket.parkingCount--;
                } else {
                    System.out.println("不好意思, 本超市车位已满, 欢迎您下次光临");
                    continue;
                }
            }
            double totalCost = 0;
            while (true) {
                System.out.println("本店提供" + littleSuperMarket.merchandises.length + "种商品, 欢迎选购, 请输入商品编号: ");
                int mid = scanner.nextInt();
                if (mid < 0) {
                    break;
                }
                if (mid >= all.length) {
                    System.out.println("本店没有该商品, 请重新输入");
                    continue;
                }
                Merchandise m = littleSuperMarket.merchandises[mid];
                System.out.println(m);
                System.out.println("请问你要买多少个?");
                int num2buy = scanner.nextInt();
                if (num2buy <= 0) {
                    System.out.println("不买看看也好~");
                    continue;
                }
                if (num2buy > m.count) {
                    System.out.println("商品库存不够啦");
                    continue;
                }
                if (num2buy * m.soldPrice > customer.money) {
                    System.out.println("余额不足");
                    continue;
                }
                totalCost += num2buy * m.soldPrice;
                m.count -= num2buy;
                littleSuperMarket.merchandiseSold[mid] += num2buy;
            }
            customer.money -= totalCost;
            if (customer.isDrivingCar) {
                littleSuperMarket.parkingCount++;
            }
            System.out.println("顾客" + customer.name + "共消费了" + totalCost);
            littleSuperMarket.incomingSum += totalCost;

            System.out.println("还要继续营业吗?");
            open = scanner.nextBoolean();
        }

        System.out.println("超市关门了!");
        System.out.println("今天的总营业额为: " + littleSuperMarket.incomingSum);
        System.out.println("营业情况如下:");
        for (int i = 0; i < littleSuperMarket.merchandises.length; i++) {
            Merchandise m = all[i];
            int numSold = littleSuperMarket.merchandiseSold[i];
            if (numSold > 0) {
                double incomming = m.soldPrice * numSold;
                double netIncomming = (m.soldPrice - m.purchasePrice) * numSold;
                System.out.println(m.name + "售出了" + numSold + "个, 销售额为" + incomming + ", 净利润为" + netIncomming);
            }
        }
    }
}
