package itmo.java.basics.hw.hw9;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReplaceInFile {
    public static void replaceLettersAndDigits(File file) {
        List<String> lines = RaedFileToList.readFileToList(file);

        List<String> replacedLines = new ArrayList<>();
        for (String line : lines) {
            String replaced = line.replaceAll("[^a-zA-Zа-яА-Я0-9]", "\\$");
            replacedLines.add(replaced);
        }

        boolean isRewriteFile = true;
        for (String line : replacedLines) {
            AddLineIntoFile.addLineIntoFile(file, line, !isRewriteFile);
            isRewriteFile = false;
        }
    }
}
