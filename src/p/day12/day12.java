package p.day12;

import java.util.Scanner;

import static java.lang.System.in;

public class day12 {
    public static void main(String[] args) {
        // get a number from user
        // if the number is larger than zero, get another number from user,
        // if second number is larger than 5 print "ok" else print "not ok"
        // if first number is less than or equal to zero, print "too cold to check"

        // think of the first number as temperature
        // second number is atmospheric pressure
        // and your code is doing diagnostics

        Scanner scanner = new Scanner(in);
        System.out.println("Enter temperature");
        int temperature = scanner.nextInt();
            if (temperature>0){

                System.out.println("Enter pressure");
                int pressure = scanner.nextInt();

                if (pressure>5) {
                    System.out.println("OK");
                }
                else System.out.println("not ok");
            }
            else System.out.println("too cold to check");




    }
}
