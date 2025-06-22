package itmo.java.basics.hw.hw5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] agrs) {
        point1();
        point2();
        point3();
        point4();
        point5();
    }

    public static String[] splitAndClean(String text) {
        return text
                .replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "") // остаются буквы, цифры и пробелы
                .split("\\s+"); // делится по пробелам, табуляциям, переводам строк
    }

    public static void point1() {
        String text = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";

        String[] strings = splitAndClean(text);
        String longest = findLongestWord(strings);
        System.out.println("Самое длинное слово: " + longest);
    }

    public static String findLongestWord(String[] words) {
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase(); // игнорируем регистр

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void point2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("Слово \"" + word + "\" является палиндромом.");
        } else {
            System.out.println("Слово \"" + word + "\" не является палиндромом.");
        }
    }

    public static String censorWordInText(String text, String targetWord, String replacement) {
        return text.replaceAll("(?i)\\b" + Pattern.quote(targetWord) + "\\b", replacement);
    }

    public static void point3() {
        String text = "Вот бяка, ещё одна БЯКА и супербяка, чтобы проерить, что не заменяется.";
        System.out.println("Исходный текст:");
        System.out.println(text);

        String censored = censorWordInText(text, "бяка", "[вырезано цензурой]");

        System.out.println("Цензурированный текст:");
        System.out.println(censored);
    }

    public static int countOccurrences(String text, String sub) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // ищем со следующего
        }
        return count;
    }

    public static void point4() {
        String text = "бякабякабяка";
        String sub = "бяка";

        int result = countOccurrences(text, sub);
        System.out.println("Количество вхождений подстроки \"" + sub + "\": " + result);
    }

    public static String reverseWordsInLine(String line) {
        String[] words = line.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim(); // убираем лишний пробел в конце
    }

    public static void point5() {
        String input = "This is a test string";

        System.out.println(input);
        String reversed = reverseWordsInLine(input);
        System.out.println("Result: " + reversed);
    }
}
