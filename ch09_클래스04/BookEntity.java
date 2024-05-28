package com.study.java_study.ch09_클래스04;

public class BookEntity {
    private int bookId;
    private String bookName;
    private String Author;
    private String publisher;

    public BookEntity(int bookId, String bookName, String author, String publisher) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.Author = author;
        this.publisher = publisher;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
