package itmo.java.basics.lessons.lesson10;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/text.txt");
        File file2 = new File("files/out.txt");

//
        InputStream is = null;
        OutputStream os = null;
//
//        try {
//            is = new FileInputStream(file);
//            os = new FileOutputStream(file2);
//
//            while (is.available() > 0) {
//                os.write(is.read());
//            }
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        } finally {
//            try {
//                if (is != null) {
//                    is.close();
//                }
//                if (os != null) {
//                    os.close();
//                }
//            } catch (IOException e) {
//                System.err.println(e.getMessage());
//            }
//        }


//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            String input;
//            while ((input = reader.readLine()) != null) {
//                System.out.println(input);
//            }
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }

//        writeData(List.of("Java", "Developer"), file2, "files/text.txt");

        //apache poi
        //jasper reports


        //nio
        Path path = Paths.get("C:\\Users\\Артур\\Downloads\\Telegram Desktop");
//        File[] files = path.toFile().listFiles();
//        if (files != null) {
//            for (File file1 : files) {
//                System.out.println(file1.getName());
//            }
//
//        }

        File file1 = path.toFile();
//        double totalSpace = file1.getTotalSpace() / 1_000_000_000.0;
//        String space = new DecimalFormat("#.##").format(totalSpace);
//        System.out.println(space + "GB");

//        System.out.println(path.getFileSystem());
    }


    public static void writeData(List<String> strings, File file, String path) {
        try(BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            String input;
            while ((input = reader.readLine()) != null) {
                for (String string : strings) {
                    writer.write(string + input);
                }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
