package Replit;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number:");
        int day = scan.nextInt();
        String result="";
        switch (day){
            case 1:
                result="Monday";
                break;
            case 2:
                result="Tuesday";
                break;
            case 3:
                result="Wednesday";
                break;
            case 4:
                result="Thursday";
                break;
            case 5:
                result="Friday";
                break;
            case 6:
                result="Saturday";
                break;
            case 7:
                result="Sunday";
                break;
            default:result="Not excist";



        }
        System.out.println(result);
        scan.close();
    }
}
