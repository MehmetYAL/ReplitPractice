package Replit;

import java.util.Scanner;

public class Middle_Character {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String word = input.next();
        int middleIndex=word.length()/2;
        int oddNumber=word.length();
        if (word.length()==1){
            System.out.println(word.charAt(0));
        }
        if (word.length()<=3){
            System.out.println(word.substring(1,2));
        }else if (word.length()>3){
            System.out.println(word.substring(middleIndex-1,middleIndex+1));
        }
        // else if (word.length()%2==0) {
           // System.out.println(word.substring(1,3));

      //  }
input.close();


    }
}
