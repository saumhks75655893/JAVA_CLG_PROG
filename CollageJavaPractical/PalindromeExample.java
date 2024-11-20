package JAVA_CLG_PROG.CollageJavaPractical;

public class PalindromeExample {
    public static void main(String[] args) {
        int r, sum = 0, temp;
        int n = 454;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
//            System.out.println(sum);
            n = n / 10;
        }
        if(temp == sum)
        {
            System.out.println(temp + " is Palindrome number.");
        }else{
            System.out.println(temp + " is Not a palindrome number.");
        }
    }
}
