package JAVA_CLG_PROG.CollageJavaPractical;


public class TransposeOfTheMatrix {
    static final int N = 4;

    static void printMatrix(int A[][], int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transpose(int A[][], int B[][]) {
        int i, j;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                B[j][i] = A[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int i, j;
        int A[][] = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        int B[][] = new int[N][N];
        System.out.println("Original Matrix : ");
        printMatrix(A, N);
        transpose(A, B);
        System.out.println();
        System.out.println("Transpose Matrix : ");
        printMatrix(B, N);

    }
}
