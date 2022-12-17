package Replit;

import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a word 1");
        System.out.println("enter a word 2");
        String word1= input.next();
        String word2= input.next();
        char w1=word1.charAt(0);
        char w2=word1.charAt(1);
        char w3=word1.charAt(2);
        char w21=word2.charAt(0);
        char w22=word2.charAt(1);
        char w23=word2.charAt(2);



        if (word1.length()==3&&word2.length()==3){
            System.out.println(""+w1+w21+w2+w22+w3+w23);

        }else {
            System.out.println("cannot merge");
        }input.close();

    }
}
