package Replit_Methods;

import java.util.Arrays;

public class ReverseWordNotLetters {
    public static void main(String[] args) {
        String str="java is fun";
        String[] word=str.split(" ");
        String reverse="";
        System.out.println(Arrays.toString(word));
        for (int i = word.length - 1; i >= 0; i--) {
//word[i]=word[i].trim();
           reverse+=" "+word[i].trim();
           reverse=reverse.trim();

            //System.out.println(word[i]);

        }
        //System.out.println(Arrays.toString(word));
        System.out.println(reverse);
    }
}
