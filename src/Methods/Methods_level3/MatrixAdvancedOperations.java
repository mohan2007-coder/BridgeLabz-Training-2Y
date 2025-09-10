package Methods.Methods_level3;

import java.util.Random;
import java.util.Scanner;

public class MatrixAdvancedOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size (2 or 3): ");
        int n = sc.nextInt();

        int[][] matrix = createRandomMatrix(n, n);

        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        if (n == 2) {
            int det = determinant2x2(matrix);
            System.out.println("\nDeterminant (2x2): " + det);

            if (det != 0) {
                System.out.println("\nInverse (2x2):");
                double[][] inv = inverse2x2(matrix);
                displayMatrix(inv);
            } else {
                System.out.println("Inverse does not exist (Determinant = 0).");
            }

        } else if (n == 3) {
            int det = determinant3x3(matrix);
            System.out.println("\nDeterminant (3x3): " + det);

            if (det != 0) {
                System.out.println("\nInverse (3x3):");
                double[][] inv = inverse3x3(matrix);
                displayMatrix(inv);
            } else {
                System.out.println("Inverse does not exist (Determinant = 0).");
            }
        }
    }

    // Create random matrix
    static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // random 0-9
        return matrix;
    }

    // Transpose
    static int[][] transpose(int[][] A) {
        int rows = A.length, cols = A[0].length;
        int[][] T = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                T[j][i] = A[i][j];
        return T;
    }

    // Determinant 2x2
    static int determinant2x2(int[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }

    // Determinant 3x3
    static int determinant3x3(int[][] A) {
        return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
                - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
                + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
    }

    // Inverse 2x2
    static double[][] inverse2x2(int[][] A) {
        double det = determinant2x2(A);
        double[][] inv = new double[2][2];
        inv[0][0] = A[1][1] / det;
        inv[0][1] = -A[0][1] / det;
        inv[1][0] = -A[1][0] / det;
        inv[1][1] = A[0][0] / det;
        return inv;
    }

    // Inverse 3x3 (using adjoint method)
    static double[][] inverse3x3(int[][] A) {
        double det = determinant3x3(A);
        double[][] inv = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                int r = 0;
                for (int m = 0; m < 3; m++) {
                    if (m == i) continue;
                    int c = 0;
                    for (int n = 0; n < 3; n++) {
                        if (n == j) continue;
                        minor[r][c] = A[m][n];
                        c++;
                    }
                    r++;
                }
                int cofactor = (int)Math.pow(-1, i + j) * determinant2x2(minor);
                inv[j][i] = cofactor / det; // transpose for adjoint
            }
        }
        return inv;
    }

    // Display int matrix
    static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%6d", val);
            }
            System.out.println();
        }
    }

    // Display double matrix
    static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }
}

