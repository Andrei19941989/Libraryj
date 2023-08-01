package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Collectors;

public class Library {
    private ArrayList<Book>books;
    public Library(){
        books  =new ArrayList<Book>();
    }
    public void add(Book b){
        books.add(b);
    }
    public Book get(String Title){
        for(int i=0;i< books.size();i++)
        {
            if(books.get(i).getTitle().equals(Title))
            {
                Book kniga=books.get(i);
                books.remove(i);
                return kniga;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String s =" ";
        for(int i=0;i<books.size();i++)
        {
            s +=books.get(i).toString();
        }
        return s;
    }

    public ArrayList<Book> getBooksByGenre(String stroka)
    {
        return (ArrayList<Book>) books.stream().filter(i->i.getGenre().toLowerCase().equals(stroka.toLowerCase())).collect(Collectors.toList());//1)stream-открываем поток(для работы с этой коллекцией) 2)filter-отфильтровыввает все элементы коллекции по условию
        //3)i-элемент коллекции 4)-> указываем условие по которому элемент остается 5)collect-собирает все элементы в новую коллекцию 6)(Collectors.toList()-превращаем элементы именно в список
        //equals--для сравнения обьектов(строк и тд)
    }
    public ArrayList<Book> GetBooksByAuthor(String author)
    {
        return(ArrayList<Book>)books.stream().filter(i->i.getAuthor().toLowerCase().equals(author.toLowerCase())).collect(Collectors.toList());
    }
    public ArrayList<Book> GetBooks()
    {
        return (ArrayList<Book>) books.stream().sorted().collect(Collectors.toList());
    }

}
