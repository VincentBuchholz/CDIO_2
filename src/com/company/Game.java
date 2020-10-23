package com.company;
import com.company.Account;
import com.company.Player;
import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to the game");

        Scanner input = new Scanner(System.in);

        //opretter spiller 1
        System.out.print("Player one, enter your name: ");
        Player playerOne = new Player(input.next());


        System.out.print("Player two, enter your name: ");
        Player playerTwo = new Player(input.next());


        //Opretter Spillernes kontoer
        Account accountPlayerOne = new Account();
        Account accountPlayerTwo = new Account();

        //her oprettes terningerne
        Die diePlayerOne = new Die();
        Die diePlayerTwo = new Die();

        String x = input.nextLine();

        System.out.println(x);

        //Her er spillet:
        do{

            //player one
            System.out.print(playerOne + " it's your turn, press enter to roll the dice: ");
            String roll1 = input.nextLine();


            if (roll1.contentEquals("")) {
                diePlayerOne.RollDice();

            }


            if (diePlayerOne.Sum() == 2) {
                System.out.println("You have landed on the field Tower and receive 250 points");
                accountPlayerOne.AddToAccount(250);
            }

            if (diePlayerOne.Sum() == 3) {
                System.out.println("You have landed on the field Crater and receive 100 points");
                accountPlayerOne.SubbFromAccount(100);
            }

            if (diePlayerOne.Sum() == 4) {
                System.out.println("You have landed on the field Palace gates and receive 100 points");
                accountPlayerOne.AddToAccount(100);
            }

            if (diePlayerOne.Sum() == 5) {
                System.out.println("You have landed on the field Cold Desert and receive 20 points");
                accountPlayerOne.SubbFromAccount(20);
            }

            if (diePlayerOne.Sum() == 6) {
                System.out.println("You have landed on the field Walled city and receive 180 points");
                accountPlayerOne.AddToAccount(180);
            }

            if (diePlayerOne.Sum() == 7) {
                System.out.println("You have landed on the field Monastery and get another turn");

            }

            if (diePlayerOne.Sum() == 8) {
                System.out.println("You have landed on the field Black cave and receive 70 points");
                accountPlayerOne.SubbFromAccount(70);
            }

            if (diePlayerOne.Sum() == 9) {
                System.out.println("You have landed on the field Huts in the mountain and receive 60 points");
                accountPlayerOne.AddToAccount(60);
            }

            if (diePlayerOne.Sum() == 10) {
                System.out.println("You have landed on the field The Werewall (werewolf-wall) and receive 80 points");
                accountPlayerOne.SubbFromAccount(80);
            }

            if (diePlayerOne.Sum() == 11) {
                System.out.println("You have landed on the field The pit and receive 50 points");
                accountPlayerOne.SubbFromAccount(50);
            }

            if (diePlayerOne.Sum() == 12) {
                System.out.println("You have landed on the field Goldmine and receive 650 points");
                accountPlayerOne.AddToAccount(650);
            }
            System.out.println(playerOne + " Your score is now: " + accountPlayerOne);
            System.out.println("");

            if (accountPlayerOne.getBalance() >= 3000) {
                System.out.println(playerOne + " You win!");
                break;
            }


            //player two
            System.out.print(playerTwo + " It's your turn, press enter to roll the dice: ");
            String roll2 = input.nextLine();


            if (roll2.contentEquals("")) {
                diePlayerTwo.RollDice();

            }

            if (diePlayerTwo.Sum() == 2) {
                System.out.println("You have landed on the field Tower and receive 250 points");
                accountPlayerTwo.AddToAccount(250);
            }

            if (diePlayerTwo.Sum() == 3) {
                System.out.println("You have landed on the field Crater and receive 100 points");
                accountPlayerTwo.SubbFromAccount(100);
            }

            if (diePlayerTwo.Sum() == 4) {
                System.out.println("You have landed on the field Palace gates and receive 100 points");
                accountPlayerTwo.AddToAccount(100);
            }

            if (diePlayerTwo.Sum() == 5) {
                System.out.println("You have landed on the field Cold Desert and receive 20 points");
                accountPlayerTwo.SubbFromAccount(20);
            }

            if (diePlayerTwo.Sum() == 6) {
                System.out.println("You have landed on the field Walled city and receive 180 points");
                accountPlayerTwo.AddToAccount(180);
            }

            if (diePlayerTwo.Sum() == 7) {
                System.out.println("You have landed on the field Monastery and get another turn");

            }

            if (diePlayerTwo.Sum() == 8) {
                System.out.println("You have landed on the field Black cave and receive 70 points");
                accountPlayerTwo.SubbFromAccount(70);
            }

            if (diePlayerTwo.Sum() == 9) {
                System.out.println("You have landed on the field Huts in the mountain and receive 60 points");
                accountPlayerTwo.AddToAccount(60);
            }

            if (diePlayerTwo.Sum() == 10) {
                System.out.println("You have landed on the field The Werewall (werewolf-wall) and receive 80 points");
                accountPlayerTwo.SubbFromAccount(80);
            }

            if (diePlayerTwo.Sum() == 11) {
                System.out.println("You have landed on the field The pit and receive 50 points");
                accountPlayerTwo.SubbFromAccount(50);
            }

            if (diePlayerTwo.Sum() == 12) {
                System.out.println("You have landed on the field Goldmine and receive 650 points");
                accountPlayerTwo.AddToAccount(650);
            }
            System.out.println(playerTwo + " Your score is now: " + accountPlayerTwo);
            System.out.println("");

            if (accountPlayerTwo.getBalance() >= 3000) {
                System.out.println(playerTwo + " You win!");
                break;
            }

        }while(accountPlayerOne.getBalance() < 3000 && accountPlayerTwo.getBalance() < 3000);




    }
}
