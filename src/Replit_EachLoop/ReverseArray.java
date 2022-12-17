package Replit_EachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++){
            arr[i] = input.nextLine();
        }String[] newRes=new String[arr.length];
        String result="";
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {

            //String result="";
            newRes[j]=arr[i];
            //String[] newRes=new String[arr.length];
           // System.out.println(Arrays.toString(newRes));
        }//System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(newRes));
input.close();



    }
}
