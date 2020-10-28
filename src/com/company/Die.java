package com.company;
import java.util.Random;
public class Die {

    Random rand = new Random();

    int die1 = 0;
    int die2 = 0;
    int die;
    int sum;


    public Die(){
        this.die1 = die1;
        this.die2 = die2;

    }

    public String toString() {
        String dice = "die 1: " + die1 + ", die 2: " + die2;
        return dice;
    }

    public int RollDice() {
        this.die1 = rand.nextInt(6)+1;
        this.die2 = rand.nextInt(6)+1;
        die = this.die1;
        return die;


    }
    //Dette er taget fra et eksemplet i 62532 lektion 08 "Dice"
    public void rollMultiple(int n) {
        for (int i = 1; i < n; i++) {
            System.out.print(RollDice() + " ");
        }

    }
    public int Sum() {
        sum = die1 + die2;
        return sum;
    }

    public static void main(String[] args) {
    }
}