package JAVA_CLG_PROG.ownJava.fileHandling;

import java.io.IOException;
import java.io.*;
public class fileWriterCharacterStream {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("igntu.txt");
        String s = "This is my collage and This is my 3rd year and I will soon be the alumina. ";
        f.write(s);
        System.out.println("File written.");
        f.close();

    }
}
