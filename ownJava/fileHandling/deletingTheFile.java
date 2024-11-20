package JAVA_CLG_PROG.ownJava.fileHandling;

import java.io.IOException;
import java.io.*;
public class deletingTheFile {
    public static void main(String[] args) throws IOException {
        File f = new File("igntu.txt");
        Boolean b = f.delete();
        if(b){
            System.out.println("File deleted successfully");
        }else{
            System.out.println("File not deleted due to some errors.");
        }
    }
}
