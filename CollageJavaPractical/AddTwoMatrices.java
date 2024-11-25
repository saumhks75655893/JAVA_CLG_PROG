package JAVA_CLG_PROG.CollageJavaPractical;

public class AddTwoMatrices {
    //    function to print matrix
    static void printMatrix(int M[][], int rowSize, int colSize) {
        for (int i = 0; i < rowSize; i++) {
            for(int j=0; j<colSize; j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }

//    function to add two matrix
    static int[][] add(int A[][],int B[][],int size){
        int i, j;
        int C[][] = new int[size][size];
        for(i = 0; i<size; i++){
            for(j=0; j<size; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }


    public static void main(String[] args) {
        int M[][] = {{1,1,1,1},
                {2,2,2,2},
                {3,3,3,3},
                {4,4,4,4}};
        int Size = 4;
        System.out.println("Matrix A : ");
        printMatrix(M, Size, Size);

        int N[][] = {{1,1,1,1},
                {2,2,2,2},
                {3,3,3,3},
                {4,4,4,4}};
        System.out.println("Matrix B : ");
        printMatrix(N, Size, Size);
        int O[][] = add(M,N,Size);
        System.out.println("Resultant matrix : ");
        printMatrix(O, Size, Size);
    }
}
