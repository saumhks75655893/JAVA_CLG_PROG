
// Loops : -----------

public class DoWhileWhileForLoop {
    public static void main(String[] args) {

        // for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " -> " + (i * 2) + " ->  " + "Hello world !!");
        }
        System.out.println();
        System.out.println();

        // while loop
        int x = 1;
        while (x <= 10) {
            System.out.println(x + " -> " + (x * 2) + " ->  " + "Hello world !!");
            x++;
        }

        System.out.println();
        System.out.println();
        // do while loop

        int y = 1;
        do {
            System.out.println(y + " -> " + (y * 2) + " ->  " + "Hello world !!");
            y++;
        } while (y <= 10);

        // difference between while and do while 
        System.out.println();
        System.out.println();
        
        int z = 12; 
        while(z < 11)
        {
            System.out.println("Himanshu kumar");
            z--; 
        }

        do{
            System.out.println("Himanshu kumar");
            z--; 
        }while(z < 11); 
    }


}
