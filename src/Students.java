import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Students
{
    public static void main(String[]args)
    {
        /*int studentId = 2;
        String name = "rags";
        String course = "science";
        int age = 25;
        try(FileWriter fw = new FileWriter("students.txt",true))
        {
            fw.write(studentId+","+name+","+course+","+age + "\n");
            System.out.println("Student added SuccessFully!");
        }
        catch(IOException e)
        {
            System.out.println("Error while writing to file"+e.getMessage());
        }*/
        try(BufferedReader br = new BufferedReader(new FileReader("students.txt")))
        {
            String line = br.readLine();// reading one line from a file as a string
            while(line != null)
            {
                String[] details = line.split(","); // converting that string as a string array
                int studentId = Integer.parseInt(details[0]);// here, again converting string fields into int!
                String name = details[1];
                String course = details[2];
                int age = Integer.parseInt(details[3]);

                System.out.println("student id: "+details[0]);
                System.out.println("student name: "+details[1]);
                System.out.println("student course: "+details[2]);
                System.out.println("student age: "+ details[3]);

                line = br.readLine();
            }

        }
        catch(IOException e)
        {
            System.out.println("Error while reading from file"+e.getMessage());
        }



    }
}
