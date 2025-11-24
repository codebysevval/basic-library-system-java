import java.util.ArrayList;
import java.util.Scanner;


public class LibraryManager {

   public ArrayList<Book>books;
   public Scanner scanner;

 //LibraryManager constructor
 public LibraryManager(){
    this.books=new ArrayList<>();
    this.scanner=new Scanner(System.in);
}
//add book
    public String addBook(){
       System.out.println("----Add New Book-----");
       System.out.println("Enter book title:");
       String title=scanner.nextLine();
       System.out.println("Enter book author:");
       String author=scanner.nextLine();
       System.out.println("Enter book ISBN:");
       String isbn=scanner.nextLine();
       System.out.println("Enter book stock:");
       int stock=scanner.nextInt();
       scanner.nextLine(); // Consume the newline character
       for(Book i:books){
         if(i.getTitle().equals(title) && i.getAuthor().equals(author)){
          //update stock if book already exists
          i.setStock(i.getStock()+stock);
          return "Book stock updated successfully!";
         }
         Book newBook=new Book(title, author, isbn, stock);
         books.add(newBook);
         return "Book added succesfully!";
       }
       return null;
      }
      

   //delete book with title and author
   public void deleteBook(){
     System.out.println("enter book title to delete:");
     String title=scanner.nextLine();
     System.out.println("enter book author to delete:");
     String author=scanner.nextLine();
     for(Book i:books){
        if(i.getTitle().equals(title) && i.getAuthor().equals(author)){
          books.remove(i);
          System.out.println("Book deleted succesfully!");
          return;
        }
     }
     System.out.println("Book not found!");
    }

   //display all books
   public void displayBooks(){
    System.out.println("----Book List----");
    if(books.isEmpty()){
      System.out.println("No books available!");
      return;
    }
    for(Book book:books){
      book.displayInfo();
      System.out.println("----------------");
    }
}
public void closeScanner(){
  scanner.close(); //for close scanner
}
}