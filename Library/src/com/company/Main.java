package com.company;

public class Main {

    public static void main(String[] args) {
	Library l =new Library();
    l.add(new Book("Where I found you","Amanda Brooke","roman"));
    l.add(new Book("THe lord of the rings","Tolkin","fantazy"));
    System.out.println(l);
        for (Book item:l.getBooksByGenre("roman"))
        {
            System.out.println(item);
        }
        System.out.println();
        for(Book item:l.GetBooksByAuthor("Tolkin"))
        {
            System.out.println(item);
        }

    }
}
