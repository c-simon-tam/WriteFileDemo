import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter output filename: ");
        String filename = input.nextLine().strip();

        System.out.println("Type END on a line of its own to finish.");

        PrintStream output = new PrintStream(filename);
        String line = input.nextLine();
        while (!line.equals("END")) {
            output.println(line);
            line = input.nextLine();
        }
        output.close();
    }
}