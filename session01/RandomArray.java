package session1.exercise2;

public class RandomArray {

    public static void main(String[] args) {

        int size = 5; 

        printMatrix(size);
    }

    public static void printMatrix(int n) {

        int[][] matrix = new int[n][n]; 

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                matrix[i][j] = (int) (Math.random() * 2);

            }
        }

        System.out.println("ماتریس تصادفی " + n + "x" + n + ":");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
