package Files.Challenge;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the name of the file");
        String fileName = input.next();
        try (FileReader reader = new FileReader(fileName)) {
            int read;
            while ((read=reader.read())!=-1) {
                System.out.println((char)read);
            }
        }catch(FileNotFoundException exception){
                System.out.printf("%s not found",fileName);
        } catch (IOException e) {
            System.out.printf("Exception %s",e.getMessage());
        }
    }
}
