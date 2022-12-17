package Replit;

import java.util.Scanner;

public class VrifyEquals {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter two word");
        String word1= input.next();
        String word2= input.next();

        if (word1.equals(word2))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }input.close();
    }
}
