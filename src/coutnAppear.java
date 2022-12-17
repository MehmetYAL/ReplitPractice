public class coutnAppear {


    public static void main(String[] args) {
        String[] str={"a","foo","bar","bla,foo"};
        String word="a";
        System.out.println(countAppear(str,word));
    }

    public static int countAppear(String[] main, String word) {
        // your code here
        int count=0;
        for (String s : main) {
            if (s.contains(word)){
                count++;
            }

        }return count;



    }

}
