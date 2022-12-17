package Replit_4_Loops;

import java.util.Scanner;

public class JavaAndPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("2enter sen");
        String sentence = scan.nextLine();
        int javaCount = 0;
        int pythonCount = 0;
        for(int i = 0; i < sentence.length()-3; i++){

            String str2 = sentence.substring(i,i+4);

            if (str2.equals("java")) {
                javaCount++;
            }

        }
        for(int i = 0; i < sentence.length()-5; i++){

            String str3 = sentence.substring(i,i+6);

            if (str3.equals("python")) {
                pythonCount++;
            }

        }
        if (javaCount == pythonCount) {
            System.out.println("true");
        }else{
            System.out.println("false");
scan.close();
        }
    }
}
