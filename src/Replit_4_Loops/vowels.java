package Replit_4_Loops;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.next();
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            char volwes = word.charAt(i);

            if (volwes == 'a' || volwes == 'e' || volwes == 'i' || volwes == 'o'||volwes=='u' ) {
                System.out.print(volwes);
                input.close();
            }
            //System.out.print(count);
        }
    }
}
