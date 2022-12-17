package Replit;

public class WithoutX {
    public static void main(String[] args) {
        String word="xjavax";
        if(word.charAt(0)=='X' || word.charAt(0)=='x')
        {
            word=word.substring(1);
        }
        if(word.charAt(word.length()-1)=='X'
                || word.charAt(word.length()-1)=='x')
        {
            word=word.substring(0,word.length()-1);
        }

        System.out.println(word);
    }
}
