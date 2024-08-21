import java.util.ArrayList;

public class Main04 {
    public static void main(String[] args) {
        int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
        int[] reversedArray = reverseArray(array);
        for (int i : reversedArray) {
            System.out.println(i);
        }
    }

    private static int[] reverseArray(int[] array) {
        ArrayList<Integer> reversArray = new ArrayList<>();
        for (int i = array.length - 1; i == 0; i--) {
            reversArray.add(array[i]);
        }
        int[] finalArray = {};
    }
}
