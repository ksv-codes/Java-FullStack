package Files;

import java.io.FileWriter;
import java.io.IOException;

public class KgCodingWriter {
    public static void main(String[] args) {
        String fileName = "Java-course.txt";
        try(FileWriter writer = new FileWriter(fileName);) {//resouce ko close kr dena chaiye agr iss tarah try(....) ase kr ek agar resource bnaya hain toh usko close krne ki zimmedari khud JVM leta hain
            writer.write("This is the best Java course.");
            System.out.println();
            for (int i = 0; i < 100; i++) {
                writer.write("*"+" ");
            }
            writer.flush();
            System.out.println("File Written Sucessfully");
        } catch (IOException e) {
           System.out.printf("Exception occured %s\n",e.getMessage());
        }
    }
}
