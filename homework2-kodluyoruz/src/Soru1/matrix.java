package Soru1;

public class matrix {
	public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4, 5 },
                        { 16, 17, 18, 19, 6 },
                        { 15, 24, 25, 20, 7 },
                        { 14, 23, 22, 21, 8 },
                        { 13, 12, 11, 10, 9 },
                      };
        printSprialMatrix(matrix);
    }

    private static void printSprialMatrix(int[][] matrix) {
        if (null == matrix) {
            return;
        }
        int noOfRows = matrix.length;
        int noOfCols = matrix[0].length;

        int i;
        int row_start = 0;
        int row_end = noOfRows;
        int col_start = 0;
        int col_end = noOfCols;

        while (row_start < row_end && col_start < col_end) {

            for (i = col_start; i < col_end; ++i) {
                System.out.print(matrix[row_start][i] + "\t");
            }
            row_start++;

            for (i = row_start; i < row_end; ++i) {
                System.out.print(matrix[i][col_end - 1] + "\t");
            }
            col_end--;

            if (row_start < row_end) {
                for (i = col_end - 1; i >= col_start; --i) {
                    System.out.print(matrix[row_end - 1][i] + "\t");
                }
                row_end--;
            }

            if (col_start < col_end) {
                for (i = row_end - 1; i >= row_start; --i) {
                    System.out.print(matrix[i][col_start] + "\t");
                }
                col_start++;
            }
        }
    }
}
