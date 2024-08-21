public class Main03 {
    public static void main(String[] args) {
        int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
        System.out.println(findMax(array));
    }

    private static Integer findMax(int[] array) {
        int maxNum = 0;
        for (int num : array) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }
}
