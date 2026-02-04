package SRP.EX1.Main;

import SRP.EX1.solution.Book;
import SRP.EX1.solution.BookPrint;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("dive into design patterns","alex","focusing on OOD");
        BookPrint bp1 = new BookPrint(b1);
        bp1.printTextToConsole();
        bp1.printTextToJSON();

    }
}