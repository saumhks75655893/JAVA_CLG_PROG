import java.util.*;
public class IfElseIfElse {
    public static void main(String[] args) {
        int x; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you number : ");
        x = sc.nextInt();

        if(x==1){
            System.out.println("Hello");
        }else if(x == 2) {
            System.out.println("Namaste ");
        }else if(x ==3)
        {
            System.out.println("Banjour");
        }else{
            System.out.println("invalid number ");
        }
    }
}
