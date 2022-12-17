package Replit_Methods;

public class LongestWord {
    public static void main(String[] args) {
        String[] words={"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};
        //String splitwo=words.split(" ");
        String longest=words[0];
        for (String each : words) {
            //String currentWord=each;
        if (each.length()>longest.length()){
            longest=each;
        }
       // System.out.println(longest);


        }
        System.out.println(longest);

    }
}
