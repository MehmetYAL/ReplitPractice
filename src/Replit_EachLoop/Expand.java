package Replit_EachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Expand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();

        }
        int[] newNUM=Arrays.copyOf(nums,6);
       // int[] newNums= new int[i+nums.length];
        System.out.println(Arrays.toString(newNUM));
        scan.close();
    }
}
