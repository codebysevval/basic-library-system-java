import java.util.Scanner;

public class Main{
  
  //only can be one public class in java
  public static void main(String[] args){
     //be for every class create object
  
    LibraryManager manager=new  LibraryManager(); //create LibraryManager object
      try (Scanner scanner = new Scanner(System.in)) {
          System.out.println("Welcome to the Library Management System!\n Please choose an option:(for exit press 4)");
          System.out.println("1. Add a book");
          System.out.println("2. Delete a book");
          System.out.println("3. Display all books");
          System.out.println("4. Exit");
          
         
          int choice=scanner.nextInt();
          scanner.nextLine(); // Consume the newline character
          
          switch(choice){
              case 1 -> System.out.println(manager.addBook());
              case 2 -> manager.deleteBook();
              case 3 -> manager.displayBooks();
              case 4 -> {
                  System.out.println("Exiting the program. Goodbye!");
                  System.exit(0);
            }
            
          } }
}
}