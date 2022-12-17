package Replit_EachLoop;

import java.util.Scanner;

public class FirstAndLastCharacter {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),
          input.nextLine(),input.nextLine()};

//char[] ch=new char[0];
  //      System.out.println(ch);
        for (String each : words) {
            String newWords=each.charAt(0)+each.substring(each.length()-1);

            System.out.println(newWords);

        }input.close();

    }
}
