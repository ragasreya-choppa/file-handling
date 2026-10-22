import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Main
{
    public static void main(String[] args)
    {
        /*try
        {
            FileWriter writer = new FileWriter("practice.txt",true);
            //The true tells Java to append new content to the existing file rather than overwrite it.
            writer.write("Hello! I am learning Java File Handling.\n");
            writer.write("I want to enter into a software field \n");
            writer.close();
            System.out.println("Data Written Successfully!");

        }
        catch(IOException e)
        {
            System.out.println("Error Writing to File: "+e.getMessage());
        }*/

        try
        {
            FileReader fr = new FileReader("practice.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null)
            {
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch(IOException e)
        {
            System.out.println("Error reading from File: "+ e.getMessage());
        }

    }
}