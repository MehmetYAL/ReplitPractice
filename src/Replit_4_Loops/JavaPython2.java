package Replit_4_Loops;

import java.util.Scanner;

public class JavaPython2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter sentence");
        String sentence = scan.nextLine();
        int javaCNT=0;
        int pythonCNT=0;
        int charStr=sentence.length();
        int wcharstr=4;
        for (int i = 0; i <=charStr-wcharstr ; i++) {
            if (sentence.substring(i,i+wcharstr).equals("java")){
javaCNT++;}
            }wcharstr=6;
            for (int i = 0; i <=charStr-wcharstr ; i++) {
                

            if (sentence.substring(i,i+wcharstr).equals("python")){
                pythonCNT++;}
            }


        System.out.println(javaCNT==pythonCNT);
            scan.close();
    }
}
