package JAVA_CLG_PROG.ownJava.fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile2 {
    public static void main(String[] args) {
        try {
            FileWriter mywrite = new FileWriter("file2.txt");
            Scanner sc = new Scanner(System.in);
            String hobbies;
            System.out.println("What is your HOBBies : ");
            hobbies = sc.nextLine();
            mywrite.write("My HObbies are : " + hobbies);
            System.out.println("File write successfully !! ");
            mywrite.close();
        } catch (Exception e) {
            System.out.println("File not written successfully !! ");
            e.printStackTrace();
        }
    }
}
