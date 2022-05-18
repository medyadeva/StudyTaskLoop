package p.podev;

import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.System.in;

public class Odev {
    public static void main(String[] args) {

        //                  TASK
        // ask number from user between  0  and 5
        // generate a random number between 0 - 5
        // check if the user number and random number are equal
        // if equals print "you win" else "you lose"

        // Note: if number user provide is between 0 - 5 run program, else print "Invalid"

        Scanner myObj = new Scanner(in);  // Create a Scanner object
        System.out.println("Enter the number between 0-5");
        int userNumber = myObj.nextInt();

        int randomNumber=(int) (random()*5);
        System.out.println("randomNumber: "+randomNumber);
        if (userNumber>=0 && userNumber<=5) {
            if (userNumber == randomNumber) {
                System.out.println("you win...");
            } else {
                System.out.println("you lose...");
            }
        }
        else {
            System.out.println("Invalid");
        }


//        int firstInt= (int)(Math.random()*-10);
//        int secondInt= (int)(Math.random()*10);
//
//        System.out.println("sum  :"+(firstInt+secondInt));




    }

}
