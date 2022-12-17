package Replit_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class mergeArrays {
    public static int[] merge(int[] a,int[] b) {
    //int len
    int lenghtA=a.length;
    int lenghtB=b.length;
    int lenghtTotal=lenghtA+lenghtB;
    int[] merge=new int[lenghtTotal];

    for(int i=0;i<lenghtA;i++){
        merge[i]=a[i];
    }for(int i=lenghtA;i<lenghtTotal;i++){
        merge[i]=b[i-lenghtA];
    }return merge;







}//end merge

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));
        in.close();
/*@Override
public String toString() {
	return "Main []";*/
    } }

