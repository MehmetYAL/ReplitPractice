package Replit_4_Loops;

import java.util.Scanner;

public class denemeyazsil {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        //WRITE YOUR CODE BELOW
        String str=word.substring(0,word.length());
        int w1=word.length();
        for(int i=0; i<w1;i++){
            char ch=str.charAt(i);
            for(int k=0;k<w1;k++){}
            System.out.print(ch);}
        input.close();
            }
        }

/*
 System.out.println("enter the name of the first guest");
            String fName = input.next();
            guestName += fName;
            System.out.println("Do you want to enter another guest's name");
            String answer = input.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("invalid answer, re enter");

            }
            if (answer.equals("yes")) {
                System.out.println("Please enter the guest's name");
                String sName = input.next();
                guestName += sName;
            }

            if (answer.equals("no")) {
                System.out.println(guestName + "," + guestName);
            }
            break;
        }
 */

