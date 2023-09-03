import java.io.*;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args){
        System.out.println("\n\nWelcome to my File i_o program.\n\n");

        String[] names = {"John","Carl","Jerry"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ericl\\IdeaProjects\\untitled\\DaChicken.txt"));
            writer.write("A chicken writing a file");
            writer.write("\nHere is another line");

            for (String name : names){
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("DaChicken.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/*

 */