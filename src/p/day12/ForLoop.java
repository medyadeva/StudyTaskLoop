package p.day12;

import java.util.Scanner;

import static java.lang.System.in;

public class ForLoop {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(in);  // Create a Scanner object
        System.out.println("Enter a string ");
        String userString = myObj.nextLine();


        for(int i=0; i<userString.length();i++){
            char c = userString.charAt(i);

            System.out.println("char at "+i+" index is: "+c);
        }

//        Scanner myObj = new Scanner(in);  // Create a Scanner object
//        System.out.println("Enter a number between ");
//        int userNumber = myObj.nextInt();
//        int sum=0;
//        for (int i=0;i<=userNumber;i++){
//            //sum=sum+i;
//            sum+=i;
//        }
//        System.out.println("sum of numbers "+ sum);

    }
}
