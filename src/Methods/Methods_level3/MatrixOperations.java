package Methods.Methods_level3;

import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows for Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int c1 = sc.nextInt();

        System.out.print("Enter number of rows for Matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int c2 = sc.nextInt();

        int[][] A = createRandomMatrix(r1, c1);
        int[][] B = createRandomMatrix(r2, c2);

        System.out.println("\nMatrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        if (r1 == r2 && c1 == c2) {
            System.out.println("\nA + B:");
            displayMatrix(addMatrices(A, B));

            System.out.println("\nA - B:");
            displayMatrix(subtractMatrices(A, B));
        } else {
            System.out.println("\nAddition and Subtraction not possible (different dimensions).");
        }

        if (c1 == r2) {
            System.out.println("\nA × B:");
            displayMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("\nMultiplication not possible (A's columns != B's rows).");
        }
    }

    // Method to create random matrix
    static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // random 0-9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int r1 = A.length, c1 = A[0].length, c2 = B[0].length;
        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to display matrix
    static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
}

