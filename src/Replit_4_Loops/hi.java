package Replit_4_Loops;

import java.util.Scanner;

public class hi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count=0;
        int hi=str.length()-1;
        for (int i = 0; i <hi ; i++) {
            String str1=str.substring(i,i+2);
            if (str1.equals("hi")){
                count++;
            }

        }
        System.out.println(count);
        scan.close();
    }
}
