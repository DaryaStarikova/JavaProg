package ru.mirea.lab2;

public class BookShelf {
    private Book[] ArrBooks;
    private int countBook;

    public BookShelf(int size) {
        ArrBooks = new Book[size];
        countBook = 0;
    }

    public void addBook(Book book) {
        if (countBook < ArrBooks.length) {
            ArrBooks[countBook] = book;
            countBook++;
        }
        else {
            System.out.println("Bookshelf full");
        }
    }

    public Book HaveBook() {
        if (countBook == 0) {
            return null;
        }

        Book min = ArrBooks[0];
        for (int i = 0; i < countBook; i++) {
            if (ArrBooks[i].getYear() < min.getYear()) {
                min = ArrBooks[i];
            }
        }

        return min;
    }

    public Book HaveBook2() {
        if (countBook == 0) {
            return null;
        }

        Book max = ArrBooks[0];
        for (int i = 0; i < countBook; i++) {
            if (ArrBooks[i].getYear() > max.getYear()) {
                max = ArrBooks[i];
            }
        }

        return max;
    }

    public void sortYear() {
        for (int i = 0; i < countBook - 1; i++) {
            for (int j = 0; j < countBook - i - 1; j++) {
                if (ArrBooks[j].getYear() > ArrBooks[j + 1].getYear()) {
                    Book x = ArrBooks[j];
                    ArrBooks[j] = ArrBooks[j + 1];
                    ArrBooks[j + 1] = x;
                }
            }
        }
    }

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.addBook(new Book("Book1", "Author1", 1000));
        bookShelf.addBook(new Book("Book2", "Author2", 908));
        bookShelf.addBook(new Book("Book3", "Author3", 3041));
        bookShelf.addBook(new Book("Book4", "Author4", 2004));

        Book have = bookShelf.HaveBook();
        System.out.println("Earliest book: " + have.getName() + " " + have.getAuthor() + " " + have.getYear());

        Book have2 = bookShelf.HaveBook2();
        System.out.println("Latest book: " + have2.getName() + " " + have2.getAuthor() + " " + have2.getYear());

        bookShelf.sortYear();
        for (Book book : bookShelf.ArrBooks) {
            System.out.println(book.getAuthor() + " " + book.getName() + " " + book.getYear());
        }
    }

}
