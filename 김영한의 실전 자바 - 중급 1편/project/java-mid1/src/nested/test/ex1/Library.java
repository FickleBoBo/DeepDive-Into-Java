package nested.test.ex1;

public class Library {
    private final Book[] books;
    private int index;

    private static class Book {
        private final String title;
        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(String title, String author) {
        if (index == books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        books[index++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }
    }
}
