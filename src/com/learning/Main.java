package com.learning;

public class Main {
    public static void main(String[] args) {
        // สร้าง object ของ PiggyBank สำหรับเจ้าของชื่อ "น้องพอใจ"
        PiggyBank piggyBank = new PiggyBank("น้องไม่พอใจ");

        // ดูยอดเงินครั้งแรก (ควรจะเป็น 0.0)
        piggyBank.showMoney();

        // หยอดเงิน
        piggyBank.addMoney(20);  // หยอดเงิน 20 บาท
        piggyBank.addMoney(50);  // หยอดเงิน 50 บาท

        // ดูยอดเงินอีกครั้งหลังจากหยอดเงิน
        piggyBank.showMoney();  // ควรจะแสดงยอดเงินทั้งหมด 70.0 บาท
    }
}
