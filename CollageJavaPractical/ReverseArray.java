package JAVA_CLG_PROG.CollageJavaPractical;

public class ReverseArray {
    public int[] reverseArray(int arr[])
    {
        int size = arr.length;
        int temp[] = new int[size];
        int index = 0;
        for(int i=0; i<size; i++)
        {
            temp[i] = arr[size-i-1];
        }
        return temp;
    }

    public static void main(String[] args) {
        ReverseArray revArr = new ReverseArray();
        int arr[] = {1,2,3,4,5,6};
        int lenArr = arr.length;
        int ans[] = revArr.reverseArray(arr);
        System.out.print("For the input array : ");
        for (int i=0; i<lenArr; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("For the output array : ");
        for (int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i]+" ");
        }
    }

}

