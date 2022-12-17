package Replit_Methods;

public class MaxNumber {
    public static void main(String[] args) {
        int[] num={-5,-2,-25,-84};
        System.out.println(maxNumber(num));
    }
    public static int maxNumber(int[] max){
        int j=max[0];
        for (int each : max) {
            if (each>j){j=each;}

        }return j;

    }
}
