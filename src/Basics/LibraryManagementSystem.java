package Basics;
//Q25. Build a simple Library Management System using OOP concepts where you can:
//Add Book
//Issue Book
//Return Book
//Display Available Books
class Book{
    int id;
    String name;
    boolean issued;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.issued = false;
    }
}
class Library{
    Book book;

    void addBooks(int id, String name){
        book = new Book(id,name);
        System.out.println("Book Added Successfully");
    }
    void issueBook(){
        if(!book.issued){
            book.issued = true;
            System.out.println("Book issued successfully");
        }
        else{
            System.out.println("Book is already issued");
        }
    }
    void returnBook(){
        if(book.issued){
            book.issued = false;
            System.out.println("Book returned successfully");
        }
        else{
            System.out.println("Book was not issued");
        }
    }
    void displayAvailableBooks(){
        if(!book.issued){
            System.out.println("Book id: "+book.id);
            System.out.println("Book Name: "+book.name);
        }
        else{
            System.out.println("No available Book");
        }
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBooks(1,"Java Programming");

        lib.displayAvailableBooks();

        lib.issueBook();
        lib.displayAvailableBooks();

        lib.returnBook();
        lib.displayAvailableBooks();
    }
}
