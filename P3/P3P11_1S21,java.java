public class P3P11_1S21 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Newton's binomial expansion:");
        printBinomialExpansion(n);

        System.out.println("\nPascal's triangle:");
        printPascalTriangle(n);
    }

    private static void printBinomialExpansion(int n) {
        for (int i = 0; i <= n; i++) {
            int c = 1;
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
                c = c * (i - j) / (j + 1);
            }
            System.out.println(c);
        }
    }

    private static void printPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int c = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
                c = c * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}