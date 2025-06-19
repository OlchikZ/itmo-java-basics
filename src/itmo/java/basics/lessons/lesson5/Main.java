package itmo.java.basics.lessons.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        String java = "Java";

//        String java2 = new String("JaVa");


//        System.out.println(java == java2);
//        System.out.println(java.equals(java2));
//        System.out.println(java.equalsIgnoreCase(java2));


        java = java.concat(" Developer");

//        System.out.println(java);

//        java = java + 123;

//        java = 80 + 120 + java + (200 + 300);

//        System.out.println(java);

        int length = java.length();
//        System.out.println(length);

//        char[] chars = java.toCharArray();
//
//        for (char aChar : chars) {
//            if (Character.isDigit(aChar)) {
//                System.out.println(aChar);
//            }
//        }


//        String str = null;

//        System.out.println(str.isEmpty());
//
//        str = "";
//        if (str != null && !str.isEmpty()) {
//            System.out.println(str);
//        }

//        System.out.println(java);
//        String substring = java.substring(3);
//        System.out.println(substring);
//        String substring2 = java.substring(3, 7);
//        System.out.println(substring2);

        String string = "\n Hello world 123141141! \n";
//        System.out.println(string);
//        string = string.trim();
//        System.out.println(string);

//        string = string.replace("1", "*");
//        string = string.replaceAll("[^0-3]", "?");
//        System.out.println(string);

        String text = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
        String[] strings = text.split(" ");

//        for (String s : strings) {
//            System.out.println(s);
//        }

//        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
//        String s = new String(bytes, StandardCharsets.UTF_8);
//        System.out.println(s);

//       Integer x = null;
//
////        String s = x.toString();
//        String s1 = String.valueOf(x);
//        System.out.println(s1);
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = reader.readLine();
//
//        System.out.println(Integer.parseInt(s));

        StringBuilder builder = new StringBuilder(java);
        StringBuilder builder2 = new StringBuilder(java);


//        System.out.println(java == builder2.toString());
//        System.out.println(builder == builder2);
//        System.out.println(builder.equals(builder2));
//        System.out.println(java.equals(builder2.toString()));
//        System.out.println(java.equals(builder));

//        for (String word : text.split(" ")) {
//            builder.append(word)
//                    .append(", ");
//        }

//        System.out.println(builder);

//        String s = builder.toString();

//
//        System.out.println(builder.reverse());

        builder.insert(4, " Middle");
        System.out.println(builder);

        builder.delete(5, 12);
        System.out.println(builder);

        StringBuffer buffer = new StringBuffer();

    }
}