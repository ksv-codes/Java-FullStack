package Files;

import java.io.FileReader;
import java.io.IOException;

public class KgCodingReader {
    public static void main(String[] args) {
        String fileName = "java-course.txt";
        try (FileReader reader = new FileReader(fileName)) {
            int cRead = 0;
            do {
                cRead = reader.read();
                System.out.print((char)cRead);
            } while (cRead!= -1);
            
        } catch (IOException e) {
            System.out.println("Eroor Occurred");
        }    }
}
