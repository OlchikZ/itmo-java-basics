package itmo.java.basics.lessons.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    // SLF4J

    private static Logger logger = Logger.getLogger("Main");
    public static void main(String[] args) {
//        someMethod();
//        throwMyUncheckedException();

//            e.printStackTrace();
        //todo implement
        throwMyUncheckedException();
        try {
//            logger.log(Level.INFO, "info");
//            System.out.println("123");
            throwMyCheckedException();
            throwMyUncheckedException();
        } catch (MyUncheckedException e) {
            logger.log(Level.INFO, "info");
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(Arrays.toString(e.getStackTrace()));
        } finally {
            System.out.println("finally");
        }
    }

    public static void throwMyCheckedException() throws MyCheckedException {
        throw new MyCheckedException("some message");
    }

    public static void throwMyUncheckedException() {
        throw new MyUncheckedException("some message");
    }

    public static void someMethod() {
        try {
            throwMyCheckedException();
        } catch (MyCheckedException e) {
            throw new RuntimeException(e);
        }
    }


    public static String getText() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }


    public static void runAlgorithm(Integer number) {
        //logic

        try {
            String parsedString = getText();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
