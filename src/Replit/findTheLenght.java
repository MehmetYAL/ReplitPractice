package Replit;

import java.util.Scanner;

public class findTheLenght {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();
        System.out.println("Length is: "+ word.length());
input.close();
    }
}
