package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("Example.txt");
            writer.write("Hello Welcome to This...!");
            writer.close();
            System.out.println("Success...!");
        }catch (IOException e){
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
    }

}
