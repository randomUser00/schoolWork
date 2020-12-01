import java.util.Scanner;
import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
public class lab13
{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name <SPACE > Phone number");
        String s = input.nextLine();

        // 1. Create File Path
        Path file = Paths.get("directory.txt");

        //2. Exception Handling
        try {
            // 3. Create buffered output stream
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));

            // 4. Buffered writer
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

            while(!s.equals("ZZZ")){
                // 5. writing to file 
                writer.write(s, 0, s.length());
                writer.newLine();

                System.out.println("Enter name <SPACE > Phone number");
                s = input.nextLine();
            }

            // 6. closing the writer
            writer.close();
            input.close();

        } catch (Exception e){
            System.out.println("Bad Iput");
        }
    }
}
