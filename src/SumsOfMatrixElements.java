import java.util.Scanner;

public class SumsOfMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int sumEvenOddRows = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] % 2 == 0) {
                        sumEvenOddRows += matrix[i][j];
                    }
                }
            }
        }

        int sumOddEvenColumns = 0;
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    if (matrix[i][j] % 2 != 0) {
                        sumOddEvenColumns += matrix[i][j];
                    }
                }
            }
        }

        int sumUpperTriangular = 0;
        int sumLowerTriangular = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    sumUpperTriangular += matrix[i][j];
                }
                if (i >= j) {
                    sumLowerTriangular += matrix[i][j];
                }
            }
        }

        System.out.println("X = " + sumEvenOddRows);
        System.out.println("Y = " + sumOddEvenColumns);
        System.out.println("A = " + sumUpperTriangular);
        System.out.println("B = " + sumLowerTriangular);

        scanner.close();
    }
}
