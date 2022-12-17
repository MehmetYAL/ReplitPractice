package Replit;

public class FirstAndLAstChar {
    public static void main(String[] args) {
        String word="java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length()-1));
        System.out.println(""+word.charAt(0)+word.charAt(word.length()-1));
    }
}
