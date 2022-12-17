package Replit;

public class StartsAndEndWith {
    public static void main(String[] args) {
        String word="wpplr";

        if (word.startsWith("a")&&word.endsWith("e")){
            System.out.println("Starts with a: true");
            System.out.println("Ends with e: true");
        }else if (word.startsWith("a")&&!word.endsWith("e")){
            System.out.println("Starts with a: true");
            System.out.println("Ends with e: false");

        } else if (!word.startsWith("a")&&word.endsWith("e")) {
            System.out.println("Starts with a: false");
            System.out.println("Ends with e: true");}

         else {System.out.println("Starts with a: false");
            System.out.println("Ends with e: false");}

    }}
