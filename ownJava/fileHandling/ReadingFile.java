package JAVA_CLG_PROG.ownJava.fileHandling;

import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        File f = new File("igntu.txt");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(s);
        }
        sc.close();
    }
}
