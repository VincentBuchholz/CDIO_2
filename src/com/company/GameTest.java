package com.company;

import java.util.Scanner;
import com.company.Account;
import com.company.Player;
import java.util.Scanner;

    public class GameTest {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("press enter to continue:");
            String enter = input.nextLine();

            if (enter.contentEquals("")){
                System.out.println("hej");
            }



            Account ac1 = new Account();
            System.out.println(ac1);

            ac1.AddToAccount(500);
            System.out.println(ac1);

            if (ac1.getBalance() == 1500) {
                System.out.println("hej");
            }

            ac1.SubbFromAccount(1700);
            System.out.println(ac1);



        /*
        Die diePlayerOne = new Die();
        System.out.println(diePlayerOne);
        diePlayerOne.RollDice();
        System.out.println(diePlayerOne);
        System.out.println(diePlayerOne.Sum());

        if (diePlayerOne.Sum() > 6) {
            System.out.println("hej");
        }
         */









        /*
        Scanner input = new Scanner(System.in);
        System.out.print("player one enter your name: ");
        Player playerOne = new Player(input.next());

        System.out.println(playerOne);
        */

        }
    }


