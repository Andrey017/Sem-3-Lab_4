package ru.mirea;

class Book implements Printable {
    String name;

    String getName(){
        return name;
    }

    Book(String name){
        this.name = name;
    }

    public void print() {
        System.out.printf("Книга %s\n", name);
    }
}
