
    import java.io.*;
import java.util.Scanner;

public class FileSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine().trim();

        int total = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = reader.readLine()) != null) {
                total += Integer.parseInt(line.trim());
            }

            System.out.println(total);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred while reading the file.");
        }
    }
}
/*
    You said:
Please convert the following Python code to Java so that the Java program executes successfully passing the test cases.

Filename = input().strip()

try:

  fin = open(filename, 'r')

  lines = fin.readlines()

  total =0

   for line in lines:

     total = int(line.strip())

   print(total)

  fin.close()

except Exception as es:

      print("FileNotFound")
 */
