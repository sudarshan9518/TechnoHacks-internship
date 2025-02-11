import javax.lang.model.element.NestingKind;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {

        // creating a file
       /*
        File myfile = new File("sudarshan.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("enable to creat a file ");
            throw new RuntimeException(e);
        }

    }*/
        // code to write in  a file
        /*
        try {
            FileWriter fileWriter = new FileWriter("sudarshan.txt");
            fileWriter.write("this is my file from this java course");
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }*/


        //


        // editing a file
/*
        File myfile = new File("sudarshan.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            throw new RuntimeException(e);
        }
*/


        // deleting file

        File myfile = new File("sudarshan.txt");
        if(myfile.delete()){
            System.out.println("deleted");
        }
        else{
            System.out.println("not deleted");
        }


    }
    }
