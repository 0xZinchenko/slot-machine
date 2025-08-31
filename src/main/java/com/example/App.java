package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;

        System.out.println("-------------------------");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐️ ");
        System.out.println("-------------------------");

        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            
            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            } else {
                balance -= bet;
            }
        }

        scanner.close();
    }
}
