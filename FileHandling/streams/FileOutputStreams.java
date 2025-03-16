package FileHandling.streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreams {
    public static void main(String[] args) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("Hey.txt");
            String data = "Welcome this is that";
            fileOutputStream.write(data.getBytes());
            fileOutputStream.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
