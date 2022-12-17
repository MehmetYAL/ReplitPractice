package Replit_EachLoop;

import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++){
            arr[i] = input.nextLine();
        for(int k = 0; k < arr.length-1; k++){

            System.out.println(arr[i] + ", " + arr[i+1]);

        }
    }*/
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++){
            arr[i] = input.nextLine();
        }

        //WRITE YOUR CODE BELOW:
        for(int i = 0; i < arr.length-1; i++){

            System.out.println(arr[i] + ", " + arr[i+1]);

        }input.close();
}
    }

