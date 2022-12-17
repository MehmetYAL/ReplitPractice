package Replit_EachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class SecondElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        System.out.println("second element"+nums[2]);
        System.out.println("second element"+ nums[nums.length-2]);
        scan.close();
        }
    }

