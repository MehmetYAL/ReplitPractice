package Replit;

import java.util.Scanner;

public class giftCard {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("select item you choose");
        String item=scan.nextLine();
        int giftCard=100;
        switch (item) {

            case "Blanket":
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (giftCard-60+"$"));
                break;
            case "Charger":
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (giftCard-25+"$"));
                break;
            case "Hat":
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (giftCard-25+"$"));
                break;
            case "Headphones":
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (giftCard-30+"$"));
                break;
            case "Laptop":
                System.out.println("Sorry, not enough funds on your gift card!");
                  break;
            case "Pants":
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (giftCard-50+"$"));
                break;
            case "Pillow":
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (giftCard-40+"$"));
                break;
            case "Smartphone":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "Socks":
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (giftCard-5+"$"));
                break;
            case "USB cable":
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (giftCard-40+"$"));
                break;
            default:
                System.out.println("Invalid item");


scan.close();
        }
    }
}
