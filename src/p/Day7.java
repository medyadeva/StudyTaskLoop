package p;

import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
//        1- Print all the numbers from 0 to 100(hundred included)
//        Use While Loop!
//
//                2- Print all the odd numbers from 1 to 100
//        Use While Loop!
//
//                3- Print all the even numbers from 0 to 100(hundred is not included)
//        Use While Loop!
//
//                4- Sum all the odd numbers from 1 to 100 (1 + 3 + 5 ....)
//        Use While Loop!

        int i = 1;
        while ( i <= 100 )
        {
            System.out.println( i );
            i++;
        }
        int j = 1;
        while ( j <= 100 )
        {
            System.out.println( j   );
            j+=2;
        }
        int k = 0;
        while ( k <100 )
        {
            System.out.println( k  );
            k+=2;
        }
        int count = 1; int sum=0;
        while ( count <= 100 )
        {

            sum=sum+count;
            count+=2;
        }
        System.out.println( sum  );
//    String text1="TechnoStudy SDET Course!";
//    System.out.println(text1.startsWith("T"));
//
//        String text2="I love java!";
//        System.out.println(text2.endsWith("java!"));
//
//        String text3="      There are 8 primitive data types in Java!         ";
//        System.out.println(text3.trim());
//
//        String text4="My bank account number is 0987654323456789 and my rooting number is 48883280129.";
//        text4.replaceAll("48883280129","*************");
//        System.out.println(text4.replaceAll("0987654323456789","***************"));
//
//        String text5="Pracicing Java is really important!";
//        System.out.println(text5.replaceAll("a","@"));
//
//        String text6="   ";
//        System.out.println("text 6 is empty ;"+text6.isEmpty());
//
//        String firstText7="HEY!";
//        String secondText7="hey!";
//        System.out.println(firstText7+" and "+secondText7+" is equal  :"+ firstText7.equals(secondText7));
//
//        String firstText8="HEY!";
//        String secondText8="hey!";
//        System.out.println(firstText8+" and "+secondText8.toUpperCase()+" is equal  :"+ firstText8.equals(secondText8.toUpperCase()));
//
//
//
//        String text9="We are going to be Software Testers in 6 months!";
//        System.out.println(text9.substring(18,35 ));
//
//        String firstText10="123456789";
//        String secondText10="0987654321";
//        System.out.println(" after Concat  : " + firstText10.concat(secondText10));



//        String text2="water";
//        System.out.println(text2);
//
//        String text3="I'm taking \"SDET\" course";
//        System.out.println(text3);
//
//        String text4="[techno study](https://technostudy.coassemble.com/student/course/34535#/)";
//        System.out.println(text4);

//        double   number1=  98.83832;
//    System.out.println(number1);
//
//        double   number2=  -3.334;
//    System.out.println(number2);
//
//        double   number3=  520.4;
//    System.out.println(number3);
//
//        double   number4=-6;
//    System.out.println(number4);


//        String welcomeMessage="Welcome to Technostudy";
//        int indexOfW=welcomeMessage.indexOf("t");
//        System.out.println(indexOfW);

//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter integer  ...");
//        int n=sc.nextInt();
//        if (n>0){
//            System.out.println("the intger is bigger tahne 0");
//        }
//        if (n==0){
//            System.out.println("the intger is 0");
//        }
//        if (n<0){
//            System.out.println("the intger is smaller tahne 0");
//        }
    }
}
