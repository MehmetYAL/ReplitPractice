package Replit_4_Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int count=1;

        for (int i = n; i >=1 ; i--) {
count=count*i;


                    }System.out.println((count));
        input.close();
    }
}
