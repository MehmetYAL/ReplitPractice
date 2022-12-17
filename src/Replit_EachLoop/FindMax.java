package Replit_EachLoop;

public class FindMax {
    public static void main(String[] args) {

        int[] num={2,4,5,3,-2,12};
        int max=num[0];

        for (int newN : num) {
            if (newN>max){max=newN;}

        }
                System.out.println(max);

    }
}
/*
find max number of array
Input:
  [2, 4, 2, 3, -2]

Output:
  4
 */