package src;

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        // Input Matrix 1
        System.out.println("Enter Matrix 1:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix1[i][j] = scanner.nextInt();

        // Input Matrix 2
        System.out.println("Enter Matrix 2:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix2[i][j] = scanner.nextInt();

        // Addition
        System.out.println("\nAddition:");
        int[][] add = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                add[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }

        // Subtraction
        System.out.println("\nSubtraction:");
        int[][] sub = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }

        // Multiplication
        System.out.println("\nMultiplication:");
        if (cols == rows) {
            int[][] mul = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    for (int k = 0; k < cols; k++) {
                        mul[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                    System.out.print(mul[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication not possible with these dimensions.");
        }
    }
}

