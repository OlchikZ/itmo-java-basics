package itmo.java.basics.hw2;

public class Book {
    private String author;
    private String title;
    private double price;
    private int pages;
    private String language;

    public Book() {
        this.author = "Неизвестен";
        this.title = "Без названия";
        this.price = 0.0;
        this.pages = 0;
        this.language = "не указан";
    }

    public Book(String author, String title, double price, int pages, String language) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.pages = pages;
        this.language = language;
    }

    public void printInfo() {
        System.out.println("Автор: " + author);
        System.out.println("Название: " + title);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Страниц: " + pages);
        System.out.println("Язык: " + language);
    }
}
