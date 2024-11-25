package JAVA_CLG_PROG.CollageJavaPractical;

public class MulTwoMatrix {
    //    function to print matrix
    public static void printMatrix(int A[][], int rowSize, int colSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
//    multiplication two matrix
    public static int[][] mulMatrix(int A[][],int B[][], int size){
        int i,j;
        int C[][] = new int[size][size];
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                C[i][j] = A[i][j] * B[i][j];
            }
        }
        return C;
    }

    public static void main(String[] args) {
        int size = 4;
        int A[][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        int B[][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        System.out.println("Matrix A : ");
        printMatrix(A,size, size);
        System.out.println();
        System.out.println("Matrix B : ");
        printMatrix(B, size, size);
        System.out.println();
        System.out.println("Resultant Matrix");
        int C[][] = mulMatrix(A,B, size);
        printMatrix(C, size,size);
    }
}
