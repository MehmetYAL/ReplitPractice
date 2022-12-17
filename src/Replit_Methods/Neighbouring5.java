package Replit_Methods;

public class Neighbouring5 {
    public static void main(String[] args) {
        int[] nums = {1, 5,2,5, 4, 1};
        boolean result = false;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i]==5&&nums[i+1]==5){
                result=true;
                break;
            }
           // else {result=false;}
        } System.out.println(result);
    }

}
