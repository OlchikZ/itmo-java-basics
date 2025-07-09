package itmo.java.basics.hw.hw9;

import java.io.File;
import java.util.List;

public class MergeFiles {
    public static void mergeFiles(File file1, File file2, File outputFile) {
        List<String> lines1 = RaedFileToList.readFileToList(file1);
        List<String> lines2 = RaedFileToList.readFileToList(file2);

        // Сначала перезаписываем файл строками из первого файла
        boolean isRewriteFile = true;
        for (String line : lines1) {
            AddLineIntoFile.addLineIntoFile(outputFile, line, !isRewriteFile);
            isRewriteFile = false;
        }

        // Затем добавляем строки из второго файла
        for (String line : lines2) {
            AddLineIntoFile.addLineIntoFile(outputFile, line, true);
        }
    }
}
