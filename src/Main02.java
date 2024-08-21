public class Main02 {
    public static void main(String[] args) {
        ninetable();
    }

    private static void ninetable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }
}
