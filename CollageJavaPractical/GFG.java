package JAVA_CLG_PROG.CollageJavaPractical;

import java.util.Scanner;

public class GFG {
    // Print array elements greater than average
    static void printAboveAvg(int arr[], int len, int number) {

        // Print elements greater than average
        System.out.print("The arr element greater than " + number + " : ");
        for (int i = 0; i < len; i++)
            if (arr[i] > number)
                System.out.print( arr[i] + " ");
    }

    // Driver program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int arr[] = {12, 4, 6, 9, 10};
        int size;
        System.out.print("Enter the size of the array : ");
        size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++)
        {
            System.out.print("Enter "+i + " element : ");
            arr[i] = sc.nextInt();
        }
        int len = arr.length;
        System.out.print("Enter the number for comparison : ");
        int number = sc.nextInt();
        System.out.print("The array is : ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        printAboveAvg(arr, arr.length, number);

    }

}
