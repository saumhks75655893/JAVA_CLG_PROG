package JAVA_CLG_PROG.CollageJavaPractical;

import java.util.*;

public class MatrixFromUser {
    public static void readMatrixByUser() {
        int m, n, i, j;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            System.out.println("Enter the number of rows of the matrix.");
            m = in.nextInt();
            System.out.println("Enter the number of columns of the matrix: ");
            n = in.nextInt();

            // Declare the matrix
            int first[][] = new int[m][n];

//            Read the matrix values
            System.out.println("Enter the elements of the matrix : ");
            for(i=0; i<m; i++){
                for(j=0; j<n; j++){
                    first[i][j] = in.nextInt();
                }
            }
//            Display the matrix
            System.out.println("The matrix is : ");
            for(i=0; i<m; i++){
                for(j=0; j<n; j++){
                    System.out.print(first[i][j]+" ");
                }
                System.out.println();
            }
        }
        catch (Exception e){

        }
        finally {
            in.close();
        }
    }

    public static void main(String[] args) {
        readMatrixByUser();
    }
}








