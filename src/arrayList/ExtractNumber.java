package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ExtractNumber {
    public static void main(String[] args) {


  //      ArrayList<String> extractNum=new ArrayList<>();
//extractNum.add("")
        String s = "aa2aa3";
        String str = "";

        for (char each :s.toCharArray()  ) {
            if (Character.isDigit(each)){
                str+=each;
            }

        }System.out.println(str);

    }




}
