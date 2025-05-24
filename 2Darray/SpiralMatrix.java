import java.util.*;

public class SpiralMatrix {
    public static void Spiral(int[][] matrix) {
        int StartR = 0;
        int StartC = 0;
        int EndR = matrix.length - 1;
        int EndC = matrix[0].length - 1;

        while (StartR <= EndR && StartC <= EndC) {

            // top
            for (int i = StartC; i <= EndC; i++) {
                System.out.print(matrix[StartR][i] + " ");
            }
            // right
            for (int j = StartR + 1; j <= EndC; j++) {
                System.out.print(matrix[j][EndC] + " ");
            }

            // bottom
            for (int j = EndC - 1; j >= StartC; j--) {
                if (StartR == EndR) {
                    break;
                }
                System.out.print(matrix[EndR][j] + " ");

            }
            // left
            for (int i = EndR - 1; i >= StartR + 1; i--) {
                if (StartC == EndC) {
                    break;
                }
                System.out.print(matrix[i][StartC] + " ");
            }
            StartC++;
            StartR++;
            EndC--;
            EndR--;
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        Spiral(matrix);
    }

}
