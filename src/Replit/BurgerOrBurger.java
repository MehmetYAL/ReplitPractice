package Replit;

import java.util.Scanner;

public class BurgerOrBurger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your choice");
        String order = s.next();
        double chiken=9.75;
        double burger=12.500;
        if (order.contains("chiken")){
            System.out.println("Your total is $"+chiken);
        }else if (order.contains("burger")){
            System.out.println("Your total is $"+burger+"0");
        }s.close();

    }
}
