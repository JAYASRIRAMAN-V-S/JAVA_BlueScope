package FileHandling.streams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreams {
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream("Example.txt");
            int data;

            while ((data = file.read()) != -1){
                System.out.println((char) data);
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
