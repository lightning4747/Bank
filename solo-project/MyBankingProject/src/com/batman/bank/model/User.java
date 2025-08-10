package com.batman.bank.model;

import java.util.Scanner;

public class User {
    private String username;
    private String password;
    private double balance;

    public User(String n, String p, double b) {
        this.username = n;
        this.password = p;
        this.balance = b;
    }
    public String getusername() {
        return username;
    }
    public String getpassword() {
        return password;
    }
    public double getbalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        try (Scanner ob = new Scanner(System.in)) {
            int c=12;
            if(amount <=0) {
                return;   //handle it in the web aswell
            }
            if(balance<0) {
                System.out.println("amount has been taken for the debt");
            }
            else {
                System.out.println("amount has been credited");
            }
            balance = balance + amount;
            while(c!=1 || c!=0) {
            System.out.println("Would you like to show balance? 1- show 0- not");
            c = ob.nextInt();
            switch (c) {
                case 1 -> System.out.println("New balance: " + balance);
                case 0 -> System.out.println("Thank you");
                default -> System.out.print("Invalid");
            }
   }
        }
    
    }
    public boolean  withdraw(double amount) {
        if(amount>balance)  { //handle amount<=0 on the web
            System.out.println("Insuffcient balance");
            return false;
        }
        if(amount > balance/65) {
            //this function is still under construction
        }

        balance = balance - amount;
        return true;
    }



}
