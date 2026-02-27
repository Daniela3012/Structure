package POO.Level1.Biblioteca;

import PAGE2.Level3.Biblioteca.Libro;

import java.util.Date;

public class Loan {
    private Date loanDate;
    private Date returnDate;
    private User user;
    private Book book;

    public Loan(Date loanDate, Date returnDate, User user, Book book) {
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.user = user;
        this.book = book;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }
}
