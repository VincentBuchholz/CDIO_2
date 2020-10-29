package com.company;

public class Account {
    int balance = 1000;


    public Account() {
        this.balance = this.balance;

    }

    public void AddToAccount(int points) {
        this.balance = this.balance + points;
    }

    public void SubbFromAccount(int points) {
        this.balance = this.balance - points;
        if (this.balance < 0) {
            this.balance = 0;
        }
    }

    public String toString() {
        String points = "" + balance;
        return points;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {

    }
}
