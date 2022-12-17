package Replit_4_Loops;

import java.util.Scanner;

public class countTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter str");
        String str = scan.next();
        int count=0;
        char char1=0;
        char char2=0;
        char char3=0;
        for (int i = 0; i <str.length() ; i++) {
            if (i+2<str.length()){
                char1=str.charAt(i);
                char2=str.charAt(i+1);
                char3=str.charAt(i+2);
                if (char1==char2&&char2==char3)
                {count++;}
            }

        }
        System.out.println(count);
        scan.close();
    }
}
