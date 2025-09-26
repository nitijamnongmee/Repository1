package com.learning;

public class PiggyBank {
    private String ownerName;
    private double money;

    public PiggyBank(String ownerName) {
        this.ownerName = ownerName;
        this.money = 0.0;
    }

    public void addMoney(double amount) {
        this.money += amount;
        System.out.println("หยอดเงินใส่กระปุกของ " + ownerName + " จำนวน " + amount + " บาท");
    }

    public void showMoney() {
        System.out.println("กระปุกของ " + ownerName + " มีเงินทั้งหมด " + money + " บาท");
    }
}
