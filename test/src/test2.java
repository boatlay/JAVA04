public class test2 {
    public static void main(String[] args) {
        test2.print(5);
    }


    public static void print(int n) {
        // 上面菱形
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = n / 2 + 1 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // 下面菱形
        for (int i = n / 2; i >= 1; i--) {
            for (int j = n / 2 + 1 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}