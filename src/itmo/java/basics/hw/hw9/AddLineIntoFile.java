package itmo.java.basics.hw.hw9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AddLineIntoFile {
    public static void addLineIntoFile(File file, String inputLine, boolean isAddLine) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, isAddLine))) {
            writer.write(inputLine);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
