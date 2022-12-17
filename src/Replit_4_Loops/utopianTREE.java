package Replit_4_Loops;

public class utopianTREE {
    public static void main(String[] args) {
        int treesize=0;
        for (int year = 1; year <10 ; year++) {
            if (year<=3){
                treesize++;
                System.out.println("year "+year+" growth 1 cm");
                System.out.println("tree size: "+(treesize));
            }
            else {treesize+=+2;
                System.out.println("year "+year+" growth 2 cm");
                System.out.println("tree size: "+(treesize)+" cm");}

        }
    }
}
