package main.java;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Please Enter any String to Print =  ");
        String str;
        str = sc.nextLine();
        System.out.println(individualCharacter(str));
    }
public static String individualCharacter(String str) {
    int i;
        for(i = 0; i < str.length(); i++)
    {
        System.out.println("The Character at Position "  + i + " =  " + str.charAt(i));
    }
        return "All characters have been printed.";
}
}
