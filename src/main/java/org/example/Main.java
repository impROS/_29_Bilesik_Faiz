package org.example;

public class Main {
    public static void main(String[] args) {
        double interest = 0.11; //yüzde 5

        UserAccount ridvanAccount = new UserAccount("Ridvan", 100, 10,interest);
        ridvanAccount.calculateInterest();
        System.out.println(ridvanAccount);

        System.out.println("-".repeat(50));
        UserAccount mehmetAccount = new UserAccount("Mehmet", 1_000, 5,interest);
        mehmetAccount.calculateInterest();
        System.out.println(mehmetAccount);
    }
}