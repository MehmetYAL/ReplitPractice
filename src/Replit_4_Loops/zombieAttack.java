package Replit_4_Loops;

import java.util.Scanner;

public class zombieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter habitants");
        int inhabitants = scan.nextInt();
int day=0;
while (inhabitants>0){

                           System.out.println("day "+day+" ["+inhabitants+"]");
    inhabitants=inhabitants/2;
    day++;

        }
        System.out.println("----EXTINCT----");
scan.close();

    }
}
