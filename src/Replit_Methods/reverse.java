package Replit_Methods;

public class reverse {
    public static void main(String[] args) {
        String wr="javakl";
        System.out.println(reverse(wr));
    }
    public static String reverse(String word){
        String result="";
        for(int i=word.length();i>0;i--){
            result+=word.charAt(i-1);
        }

                return result;
            }


}

