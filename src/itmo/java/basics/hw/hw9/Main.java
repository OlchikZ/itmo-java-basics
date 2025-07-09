package itmo.java.basics.hw.hw9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static itmo.java.basics.hw.hw9.AddLineIntoFile.addLineIntoFile;
import static itmo.java.basics.hw.hw9.MergeFiles.mergeFiles;
import static itmo.java.basics.hw.hw9.RaedFileToList.readFileToList;
import static itmo.java.basics.hw.hw9.ReplaceInFile.replaceLettersAndDigits;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/text.txt");
        File file2 = new File("files/out.txt");
        File file3 = new File("files/sum.txt");

        System.out.println("Point 1");
        readFileToList(file);

        System.out.println("Point 2");
        String line = "Привет, мир!";
        boolean isAddLine = false; // false — перезаписать файл, true — добавить в конец файла
        addLineIntoFile(file2, line, isAddLine);

        System.out.println("Point 3");
        mergeFiles(file,file2,file3);

        System.out.println("Point 4");
        replaceLettersAndDigits(file3);
    }
}

