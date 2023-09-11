package J10_InputOutput;

import java.io.File;
import java.io.IOException;

public class J15_File {
    public static void main(String[] args) throws IOException {

        File file = new File("java/text.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        boolean isFile = file.isFile();
        System.out.println("Is file: " + isFile);

        boolean isDirectory = file.isDirectory();
        System.out.println("Is directory: " + isDirectory);

        File directory = new File("java");

        isDirectory = directory.isDirectory();
        System.out.println("Is directory: " + isDirectory);

        File[] files = directory.listFiles();

        for(File f: files) {
            System.out.println(f.getName());
        }
    }
}
