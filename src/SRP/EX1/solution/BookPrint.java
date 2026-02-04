package SRP.EX1.solution;

public class BookPrint {
    private Book book;

    public BookPrint(Book book){
        this.book = book;
    }

    public void printTextToConsole() {
        System.out.println("Title: " + this.book.getName());
        System.out.println("By: " + this.book.getAuthor());
        System.out.println("Content: " + this.book.getText());
    }

    public void printTextToJSON() {
        System.out.println("{ \"title\": \"" + this.book.getName() + "\" ... }");
    }
}
