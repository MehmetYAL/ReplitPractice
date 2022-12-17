package Replit_Methods;

import java.util.Arrays;

public class populate {
    public static void main(String[] args) {
        //nt[] nmbr=new int[3];
       /* int[] i=new int[3];
        i=populate(i);
        System.out.println(Arrays.toString(i));
        populate(i);*/

    }

    public static int[] populate(int n) {
int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }

        return arr;
    }

}
