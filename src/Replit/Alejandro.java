package Replit;

import java.util.Scanner;

public class Alejandro {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String email = s.nextLine().toLowerCase();

        //WRITE YOUR CODE BELOW


        // String email = input.nextLine().toLowerCase();
        if (email.contains("Alejandro")&&email.contains("project")){
            System.out.println("priority");

        } else if (email.contains("Alejandro")) {
            System.out.println("read");

        } else {
            System.out.println("don't read");
        }s.close();

    }}
