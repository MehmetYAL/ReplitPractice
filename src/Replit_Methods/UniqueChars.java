package Replit_Methods;

public class UniqueChars {
    public static void main(String[] args) {
String str="java";
        System.out.println(uniqueChar(str));
    }public static String uniqueChar(String str){
        String result="";

        for (int i = 0; i <=str.length()-1 ; i++) {
            String currentChar=str.substring(i,i+1);
            if (! result.contains(currentChar)){
                result+=currentChar;
            }
           // if (result=1)


        }return result;
    }
}
/*
Finish the method called uniqueChars()
that will take a String str argument and returns a String
that will only have a unique copy of each character.
Remove the duplicate instances of each character.
 The uniqueChars() method is already called in the main method with an argument.
 example:
 uniqueChars("java")
output:
  jav
 */