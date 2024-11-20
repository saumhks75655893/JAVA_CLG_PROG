package JAVA_CLG_PROG.ownJava.fileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile1 {
    public static void main(String[] args) {
        try{
            FileWriter myWrite = new FileWriter("file1.txt");
            myWrite.write("Welcome to the jungle");
            myWrite.close();
            System.out.println("File created successfully !! ");
        }
        catch(Exception e){
            System.out.println("Some error occurred !! ");
            e.printStackTrace();
        }
    }
}
