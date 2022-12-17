package Replit;

public class WithOutFirstLastCharacter {
    public static void main(String[] args) {
        String str="adobe";

        System.out.println("without fisrt letter: "+str.substring(1));
        System.out.println("without last letter: "+str.substring(0,str.length()-1));
    }

}
