//WAP to find the largest of n natural numbers.

package JAVA_CLG_PROG.CollageJavaPractical;

public class largestInArray {
    public static int getLargest(int[] a, int total){
        int temp;
        for(int i=0; i<total; i++){
            for(int j=i+1; j<total; j++)
            {
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-1];
    }

    public static void main(String[] args) {
        int a[] = {1,2,5,6,3,2};
        int lena = a.length;
        int b[] = {44,66,99,77,33,22,55};
        int lenb = b.length;
        System.out.println("Largest:"+getLargest(a,lena));
        System.out.println("Largest:"+getLargest(b,lenb));

    }
}
