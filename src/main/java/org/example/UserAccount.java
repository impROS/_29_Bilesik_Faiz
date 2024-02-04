package org.example;

public class UserAccount {
    String userName;
    double balance;
    double totalMoney;
    int year;
    double interest;//Aylık faiz oranı

    public UserAccount(String userName, double balance, int year, double interest) {
        this.userName = userName;
        this.balance = balance;
        this.year = year;
        this.interest = interest;
        this.totalMoney = balance;
    }

    public void calculateInterest() {
        for (int i = 0; i < year*12; i++) {
            double interestMoney = totalMoney * interest;
            totalMoney = totalMoney + interestMoney;
        }
    }

    @Override
    public String toString() {
        return userName + "in " + year +
                " yıl sonundaki parası: Yüzde "+ interest+" faiz oranı ile "
                + balance + " TL den," +
                (int) totalMoney + " oldu." +
                " Toplam Kazanç: " + (int) (totalMoney - balance) + " TL";
    }
}
