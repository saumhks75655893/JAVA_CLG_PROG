package JAVA_CLG_PROG.ownJava.fileHandling;
import java.io.*;

public class createNewFilefileClassModule {
    public static void main(String[] args) throws IOException {
        File f = new File("igntu.txt");
        boolean s = f.createNewFile();
        if(s){
            System.out.println("File created successfully.");
        }else{
            System.out.println("Due to some error file not created.");
        }

    }
}
