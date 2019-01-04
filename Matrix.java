//MOISES BARBERA RAMOS 
//07-02-2017 LIVERPOOL, UK

package ENCRYPTION PROJECT;

import java.io.PrintWriter;

public class Matrix {

    public static int determinant(int[][] matrix) {

        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[2][1] * matrix[1][2])
                - matrix[1][0] * (matrix[0][1] * matrix[2][2] - matrix[2][1] * matrix[0][2])
                + matrix[2][0] * (matrix[0][1] * matrix[1][2] - matrix[1][1] * matrix[0][2]);
    }
     public static int[][] inverse(int[][] matrix) {

        int[][] cofactor = new int[3][3];

        cofactor[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        cofactor[1][0] = matrix[0][1] * matrix[2][2] - matrix[2][1] * matrix[0][2];
        cofactor[2][0] = matrix[0][1] * matrix[1][2] - matrix[1][1] * matrix[0][2];

        cofactor[0][1] = matrix[1][0] * matrix[2][2] - matrix[2][0] * matrix[1][2];
        cofactor[1][1] = matrix[0][0] * matrix[2][2] - matrix[2][0] * matrix[0][2];
        cofactor[2][1] = matrix[0][0] * matrix[1][2] - matrix[1][0] * matrix[0][2];

        cofactor[0][2] = matrix[1][0] * matrix[2][1] - matrix[2][0] * matrix[1][1];
        cofactor[1][2] = matrix[0][0] * matrix[2][1] - matrix[2][0] * matrix[0][1];
        cofactor[2][2] = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];

        int[][] inverseMatrix = new int[3][3];

        int k = 1;

        for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {

               if (k % 2 == 0) {
                   int a = -1;
                   inverseMatrix[i][j] = a * cofactor[j][i];
               } else {
                   inverseMatrix[i][j] = cofactor[j][i];
               }
               k++;
             }
          }
          return inverseMatrix;
        }
        public static int[][] product(int[][] firstMatrix, int[][] secondMatrix,
                                  int secondMatrixRow, int secondMatrixColumn) {
        int[][] matrix = new int[3][secondMatrixColumn];

        if (3 == secondMatrixRow) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < secondMatrixColumn; j++) {
                    for (int n = 0; n < 3; n++) {
                        matrix[i][j] += firstMatrix[i][n] * secondMatrix[n][j];
                    }
                }
            }
        } else {
            new PrintWriter(System.out).println("Your matrix are not consistent!");
        }

        return matrix;
    }

    public static int[][] getMatrix(int randomNumber) {

        switch (randomNumber) {
            case 0:
                return new int[][]{{44, 45, 28}, {17, 58, 44}, {17, 84, 81}};
            case 1:
                return new int[][]{{44, 45, 28}, {17, 58, 44}, {17, 84, 81}};
            case 2:
                return new int[][]{{84, 18, 101}, {53, 90, 71}, {59, 59, 40}};
            case 3:
                return new int[][]{{28, 70, 90}, {102, 34, 77}, {11, 84, 27}};
            case 4:
                return new int[][]{{64, 50, 48}, {14, 25, 59}, {38, 66, 107}};
            case 5:
                return new int[][]{{48, 81, 88}, {104, 48, 32}, {81, 108, 23}};
            case 6:
                return new int[][]{{99, 68, 82}, {42, 94, 15}, {71, 86, 73}};
            case 7:
                return new int[][]{{49, 14, 95}, {28, 66, 80}, {65, 59, 50}};
            case 8:
                return new int[][]{{63, 93, 82}, {54, 86, 61}, {78, 101, 47}};
            case 9:
                return new int[][]{{20, 33, 63}, {97, 25, 39}, {103, 97, 75}};
            default:
                return new int[][]{{44, 45, 28}, {17, 58, 44}, {17, 84, 81}};
        }
    }

    public static int[][] randomMatrix() {
        int[][] matrix = new int[2][2];

        int row = matrix.length;
        int column = matrix[0].length;

        int det = 0;

        while (det == 0) {

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    matrix[i][j] = new Random().nextInt(101);
                }
            }

            det = 1;
//            det = determinant(matrix);
        }

        return matrix;
    }
}
