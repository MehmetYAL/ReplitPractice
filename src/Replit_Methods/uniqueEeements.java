package Replit_Methods;

public class uniqueEeements {
    public static void main(String[] args) {
        int[] numbers={1,2,5,1,87,2,45,5};
        Unique(numbers);
    }

    public static void Unique(int[] nums){
        for (int each : nums) {int count=0;
            for (int num:nums ) {if (num==each)count++;  }
            if (count==1) System.out.println(each);

        }
    }
}
