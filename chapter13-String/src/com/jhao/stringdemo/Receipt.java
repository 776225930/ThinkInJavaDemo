package com.jhao.stringdemo;

import java.util.Formatter;

/**
 * @author JiangHao
 * @date 2020/5/2
 * @describe
 */
public class Receipt {

    private double total;
    private Formatter formatter = new Formatter(System.out);

    public void printTitle() {
        formatter.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        formatter.format("%-15s %5s %10s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        formatter.format("%-15.15s %5d %10.2f\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        formatter.format("%-15s %5s %10.2f\n", "Tax", "", total * 0.06);
        formatter.format("%-15s %5s %10s\n", "", "", "-----");
        formatter.format("%-15s %5s %10.2f\n", "Total", "", total * 1.06);
    }

    public void printTest(double width) {
        formatter.format("%-" + width + "s %"+ width + "s %"+ width + "s\n", "aaa", "bbb", "ccc");
        formatter.format("%s %s %s\n", "aaa", "bbb", "ccc");
        formatter.format("%s %s %b\n", "aaa", "bbb",null);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas ", 3, 5.1);
        receipt.print("Three Bears Porridge ", 1, 14.29);
        receipt.printTotal();
        receipt.printTest(5.2);

    }
}
