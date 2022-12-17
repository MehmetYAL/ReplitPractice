package Replit_4_Loops;

import java.util.Scanner;

public class eachLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();
        String str = word.substring(0, word.length());
        int w1 = word.length();

        for (int i = 0; i < w1; i++) {
char ch=str.charAt(i);
            for (int k = 0; k <w1 ; k++) {
               // System.out.println("\n");
            }
                System.out.print(ch);
            input.close();

            }

        }
    }

