package itmo.java.basics.lessons.lesson11.factory;

public class CsvConverterFactory implements DocumentConverterFactory{
    @Override
    public DocumentConverter createConverter() {
        return new CsvConverter();
    }
}
