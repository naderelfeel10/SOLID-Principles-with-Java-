package SRP.EX1.problem;

public class Book {

    private String name;
    private String author;
    private String text;

    public Book(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    public String getName() { return name; }
    public String getAuthor() { return author; }
    public String getText() { return text; }

    public void printTextToConsole() {
        System.out.println("Title: " + name);
        System.out.println("By: " + author);
        System.out.println("Content: " + text);
    }

    public void printTextToJSON() {
        System.out.println("{ \"title\": \"" + name + "\" ... }");
    }

}