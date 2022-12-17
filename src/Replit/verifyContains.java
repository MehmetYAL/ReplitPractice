package Replit;

import java.util.Scanner;

public class verifyContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter word and sentence");
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        boolean str=sentence.contains(word);
        System.out.println(str);
        scan.close();
    }
}
