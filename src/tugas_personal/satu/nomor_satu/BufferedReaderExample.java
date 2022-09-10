import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        // declare variable
        String occupation;

        // create inputStream object from InputStreamReader class
        InputStreamReader inputStream = new InputStreamReader(System.in);

        // create br object from BufferedReader class
        BufferedReader br = new BufferedReader(inputStream);

        // fill name variable with BufferedReader
        System.out.print("Fill your occupation: ");
        occupation = br.readLine();

        // print occupation variable on console
        System.out.println("Your occupation is " + occupation);
    }
}