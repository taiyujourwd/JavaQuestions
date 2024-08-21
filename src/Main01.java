import java.util.ArrayList;

public class Main01 {
    public static void main(String[] args) {
        System.out.println(printEver3(88));
    }

    private static ArrayList<Integer> printEver3(Integer num) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 1) {
                numList.add(i);
            }
        }
        return numList;
    }
}
