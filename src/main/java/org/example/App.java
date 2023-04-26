package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    static public void main(String... args) {
        ListContainer<String> myContainer = new ListContainer<>();
        myContainer.addToList("hello");
        myContainer.addToList("goodbye");
        myContainer.addToList("greetings");
        myContainer.deleteFromList(2);

        System.out.println(myContainer.getMyList());
    }
}

class ListContainer<T> {
    List<T> myList;

    ListContainer() {
        this.myList = new ArrayList<T>();
    }

    public List<T> getMyList() {
        return myList;
    }

    public void addToList(T item) {
        myList.add(item);
    }

    public void deleteFromList(int index) {
        myList.remove(index);
    }
}