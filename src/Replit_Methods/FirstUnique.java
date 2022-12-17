package Replit_Methods;

public class FirstUnique {
    public static void main(String[] args) {
        int[] nums={6,44,6,4,3,4,1};
       /* for (int i = 0; i < nums.length ; i++) {


            int count = 0;
            for (int each : nums) {
                if (each == nums[i]) {
                    count++;
                }

            }if (count == 1) {
            System.out.println(nums[i]);
            break;};*/
        for (int i = 0; i < nums.length ; i++) {


            int count = 0;
            for (int each : nums) {
                if (each == nums[i]) {
                    count++;
                }

            }if (count == 1) {
                System.out.println(nums[i]);
                break;};
        }
        
    }
}
