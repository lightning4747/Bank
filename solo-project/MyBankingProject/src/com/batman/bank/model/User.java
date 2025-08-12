package com.batman.bank.model;

public class User {
    private String username;
    private String password;
    private double balance;
    private String mail;

    public User(String n, String m, String p, double d) {
        this.username = n;
        this.mail = m;
        this.password = p;
        this.balance = d;
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
    public String getmail() {
        return mail;
    }
    
    public void deposit(double amount) {
  
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

        }
    
    
    public boolean  withdraw(double amount) {
        if(amount>balance)  { //handle amount<=0 on the web
            System.out.println("Insuffcient balance");
            return false;
        }
        if(amount > balance/457) {
            //this function is still under construction
        }

        balance = balance - amount;
        return true;
    }



}
