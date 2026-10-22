// this file using try-with Resources instead of try ! Here we don't need to write fw.close() because of using try-with resources
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Practice2
{
    public static void main(String[]args)
    {
        /*try(FileWriter fw = new FileWriter("practice2.txt",true))
        {
            fw.write("Hello Java \n");
            System.out.println("Data Written Successfully!");
        }
        catch(IOException e)
        {
            System.out.println("Error: "+ e.getMessage());
        }*/

        try(BufferedReader br = new BufferedReader(new FileReader("practice2.txt")))
        {
            String line = br.readLine();

            while(line!=null)
            {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e)
        {
            System.out.println("Error Reading From File: "+e.getMessage());
        }


    }
}
