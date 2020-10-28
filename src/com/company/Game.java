package com.company;
import com.company.Account;
import com.company.Player;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to the game!");

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
        do {
            boolean playerOneExtraTurn = true;
            boolean playerTwoExtraTurn = true;
            //player one
            do {
                System.out.print(playerOne + " it's your turn, press enter to roll the dice!: ");
                String roll1 = input.nextLine();


                if (roll1.contentEquals("")) {
                    diePlayerOne.RollDice();

                }


                if (diePlayerOne.Sum() == 2) {
                    System.out.println("You have landed on the field Tower and receive 250 coins");
                    accountPlayerOne.AddToAccount(250);
                    playerOneExtraTurn = false;
                }

                if (diePlayerOne.Sum() == 3) {
                    System.out.println("You have landed on the field Crater and receive 100 coins");
                    accountPlayerOne.SubbFromAccount(100);
                    playerOneExtraTurn = false;
                }

                if (diePlayerOne.Sum() == 4) {
                    System.out.println("You have landed on the field Palace gates and receive 100 coins");
                    accountPlayerOne.AddToAccount(100);
                    playerOneExtraTurn = false;
                }

                if (diePlayerOne.Sum() == 5) {
                    System.out.println("You have landed on the field Cold Desert and receive 20 coins");
                    accountPlayerOne.SubbFromAccount(20);
                    playerOneExtraTurn = false;
                }

                if (diePlayerOne.Sum() == 6) {
                    System.out.println("You have landed on the field Walled city and receive 180 coins");
                    accountPlayerOne.AddToAccount(180);
                    playerOneExtraTurn = false;
                }

                if (diePlayerOne.Sum() == 7) {
                    System.out.println("Monastery");
                    playerOneExtraTurn = false;
                }

                if (diePlayerOne.Sum() == 8) {
                    System.out.println("Black cave");
                    accountPlayerOne.SubbFromAccount(70);
                    playerOneExtraTurn = false;
                }

                if (diePlayerOne.Sum() == 9) {
                    System.out.println("Huts in the mountain");
                    accountPlayerOne.AddToAccount(60);
                    playerOneExtraTurn = false;
                }

                if (diePlayerOne.Sum() == 10) {
                    System.out.println("The Werewall (werewolf-wall)");
                    accountPlayerOne.SubbFromAccount(80);
                    playerOneExtraTurn = true;
                }

                if (diePlayerOne.Sum() == 11) {
                    System.out.println("The pit");
                    accountPlayerOne.SubbFromAccount(50);
                    playerOneExtraTurn = false;
                }

                if (diePlayerOne.Sum() == 12) {
                    System.out.println("Goldmine");
                    accountPlayerOne.AddToAccount(650);
                    playerOneExtraTurn = false;
                }
                System.out.println(playerOne + " your score is now: " + accountPlayerOne);
                System.out.println("");

                if (accountPlayerOne.getBalance() >= 3000) {
                    System.out.println(playerOne + " you win!");
                    break;
                }
            } while (playerTwoExtraTurn == true);


            //player two
            do {
                System.out.print(playerTwo + " it's your turn, press enter to roll the dice: ");
                String roll2 = input.nextLine();


                if (roll2.contentEquals("")) {
                    diePlayerTwo.RollDice();

                }

                if (diePlayerTwo.Sum() == 2) {
                    System.out.println("You have landed on the field Tower and receive 250 coins");
                    accountPlayerTwo.AddToAccount(250);
                    playerTwoExtraTurn = false;
                }

                if (diePlayerTwo.Sum() == 3) {
                    System.out.println("You have landed on the field Crater and receive 100 coins");
                    accountPlayerTwo.SubbFromAccount(100);
                    playerTwoExtraTurn = false;
                }

                if (diePlayerTwo.Sum() == 4) {
                    System.out.println("You have landed on the field Palace gates and receive 100 coins");
                    accountPlayerTwo.AddToAccount(100);
                    playerTwoExtraTurn = false;
                }

                if (diePlayerTwo.Sum() == 5) {
                    System.out.println("You have landed on the field Cold Desert and receive 20 coins");
                    accountPlayerTwo.SubbFromAccount(20);
                    playerTwoExtraTurn = false;
                }

                if (diePlayerTwo.Sum() == 6) {
                    System.out.println("You have landed on the field Walled city and receive 180 coins");
                    accountPlayerTwo.AddToAccount(180);
                    playerTwoExtraTurn = false;
                }

                if (diePlayerTwo.Sum() == 7) {
                    System.out.println("Monastery");
                    playerTwoExtraTurn = false;
                }

                if (diePlayerTwo.Sum() == 8) {
                    System.out.println("Black cave");
                    accountPlayerTwo.SubbFromAccount(70);
                    playerTwoExtraTurn = false;
                }

                if (diePlayerTwo.Sum() == 9) {
                    System.out.println("Huts in the mountain");
                    accountPlayerTwo.AddToAccount(60);
                    playerTwoExtraTurn = false;
                }

                if (diePlayerTwo.Sum() == 10) {
                    System.out.println("The Werewall (werewolf-wall)");
                    accountPlayerTwo.SubbFromAccount(80);
                    playerTwoExtraTurn = true;
                }

                if (diePlayerTwo.Sum() == 11) {
                    System.out.println("The pit");
                    accountPlayerTwo.SubbFromAccount(50);
                    playerTwoExtraTurn = false;
                }

                if (diePlayerTwo.Sum() == 12) {
                    System.out.println("Goldmine");
                    accountPlayerTwo.AddToAccount(650);
                    playerTwoExtraTurn = false;
                }
                System.out.println(playerTwo + " your score is now: " + accountPlayerTwo);
                System.out.println("");

                if (accountPlayerTwo.getBalance() >= 3000) {
                    System.out.println(playerTwo + " you win!");
                    break;
                }
            } while (playerTwoExtraTurn == true);

        } while (accountPlayerOne.getBalance() < 3000 && accountPlayerTwo.getBalance() < 3000);


    }
}
