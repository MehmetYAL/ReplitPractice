package Replit_EachLoop;

import java.util.Arrays;

public class Tempereture {
    public static void main(String[] args) {
        double[] temps={80,88,95,78,70};
        //int k=0;
        double total=0;
        double avgTemp=0;
        for (double derece : temps) {
            total+=derece;
            avgTemp=total/temps.length;
            System.out.println(derece);

        }

        System.out.println(total);
        System.out.println(avgTemp);
    }
}
