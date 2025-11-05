import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите порядок квадратной матрицы M: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[m][m];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nСредние арифметические по диагоналям, параллельным побочной:");


        for (int s = 0; s <= 2 * m - 2; s++) {
            int sum = 0;
            int count = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (i + j == s) {
                        sum += matrix[i][j];
                        count++;
                    }
                }
            }

            if (count > 0) {
                double avg = (double) sum / count;
                System.out.printf("Диагональ (i+j=%d): %.2f%n", s, avg);
            }
        }
    }
}