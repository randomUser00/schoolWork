import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
public class reader13
{
    public static void main(String [] args){

        // 1. Create File Path
        Path file = Paths.get("directory.txt");

        //2. Exception Handling
        try {
            // 3. Create buffered input stream
            InputStream input = new BufferedInputStream(Files.newInputStream(file));

            // 4. Buffered reader
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // 5. reading from  file
            String s = reader.readLine();
            System.out.println("The contents of the file are: ");
            while(s != null){
                System.out.println(s);
                s = reader.readLine();
            }
            // 6. closing the reader
            reader.close();

        } catch (Exception e){
            System.out.println("Bad Iput");
        }
    } 
}
