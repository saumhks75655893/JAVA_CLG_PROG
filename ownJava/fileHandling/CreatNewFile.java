package JAVA_CLG_PROG.ownJava.fileHandling;

import java.io.File;
import java.io.IOException;

public class CreatNewFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("D:\\file2.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created successfully : "+myObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("An error occurred !! ");
            e.getStackTrace();
        }
    }
}
