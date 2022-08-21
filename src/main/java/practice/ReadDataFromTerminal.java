package practice;

import java.util.Scanner;

public class ReadDataFromTerminal {

    public void getInputFromUser(){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: " );
        String s = in.nextLine();
        System.out.println("You entered string: " + s);

        System.out.println("Enter Your age:");
        int a = in.nextInt();
        System.out.println("You entered string: " + a);

        System.out.println("Enter Your product price:");
        float b = in.nextFloat();
        System.out.println("You entered string: " + b);

    }
}
