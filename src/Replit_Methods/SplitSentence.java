package Replit_Methods;

public class SplitSentence {
    public static void main(String[] args) {
        String sentence="Java is fun";
        String[] split=sentence.split(" ");
        for (String words : split) {
            System.out.println(words);

        }

    }
}
