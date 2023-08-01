package com.company;

public class Book implements Comparable<Book> {
    private String Title;
    private String Author;
    private String Genre;
    public Book(String title,String author,String genre){
        this.Title=title;
        this.Author=author;
        this.Genre=genre;

    }


    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Genre='" + Genre + '\'' +
                '}';
    }


    public String getTitle(){
        return Title;
    }
    public String getAuthor(){
        return Author;
    }
    public String getGenre(){
        return Genre;
    }

    @Override
    public int compareTo(Book o) {
        return getTitle().compareTo(o.Title);
    }
}
