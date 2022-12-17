package Replit_4_Loops;

import java.util.Scanner;

public class party {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String guest="";
        String guests="";
        String reply="";
        do {
            System.out.println("please enter guest name");
            guest= input.nextLine();
            guests=guests+guest+",";
            System.out.println("Do you want to enter new guest name");
            reply= input.nextLine();
        }
        while (reply.equals("yes"));
            System.out.println(" Guest list: "+ guests.substring(0,guests.length()-1));


input.close();
        }
        }




