package Replit_4_Loops;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string");
        String str = scan.nextLine();
        int cat=0;
        int dog=0;
        int lenghtStr=str.length()-3;
        for (int i = 0; i <=lenghtStr ; i++) {
            String str1=str.substring(i,i+3);
            if (str1.equals("cat")){
            cat++;}
            if (str1.equals("dog")){
                dog++;
            }

        }
        System.out.println(cat==dog);
scan.close();


    }
}
