package ru.home.training;

public class Library {


    private static int N = 5; //количество книг в библиотеке

    private Book book[] = new Book[N];


    public void loan(Book search) throws BookLoanException, BookNotFoundException {

        for (int i = 0; i < N; i++) {
            if ((book[i]!= null) && (book[i] == search) && (book[i].onloan = true)) {
                book[i].setOnloan(false);
            } else throw new BookLoanException("Данная книга выдана " + search.toString());

            if (search != book[i])
                throw new BookNotFoundException("Данная книга не найдена");
        }
    }

    public void addBook(Book newbook) {
        for (int i = 0; i < N; i++) {
            if (book[i] == null) {
                book[i] = newbook;
                book[i].onloan = true;
                break;
            } else continue;
        }
    }


    public void removeBook(Book deletebook) {
        for (int i = 0; i < N; i++) {
            if (book[i].getId()
                    == deletebook.getId()) {
                book[i] = null;
                break;
            } else continue;
        }
    }


    public void allBooks() {
        for (int i = 0; i < N; i++) {
        System.out.println(book[i]);
        }
    }
}

