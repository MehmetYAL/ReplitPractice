package Replit;

public class HalfTwice {
    public static void main(String[] args) {
        String word="helloden";
        int stringlen=word.length();
       int halfWord=stringlen/2;
       String halfWord2=word.substring(0,halfWord);
        //String word1=word.substring(0,1);
        //String word2=word.substring(1,2);
        System.out.println(halfWord2+halfWord2);

    }
}
