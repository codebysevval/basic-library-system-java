public class Book{

    private String isbn;
    private String author;
    private String title;
    private int stock;

    //constructor
    public Book(String title,String author, String isbn, int stock) {
        this.title=title;
        this.author = author;
        this.isbn = isbn;
        this.stock = stock;
        
    }

  //Getter And Setters Methods
  public String getTitle(){
    return title;
  }
  public  void setTitle(String title){
    this.title=title;
  }
  public String getAuthor(){
    return author;
  }
  
  public void setAuthor(String author){
    this.author=author;
  }
  public String getIsbn(){
    return isbn;
  }
  public void setIsbn(String isbn){
    this.isbn=isbn;
  }
  public int getStock(){
    return stock;
  }

  public void setStock(int stock){
    this.stock=stock;
  }

  //equals method
  @Override
  public int hashCode(){
    return java.util.Objects.hash(isbn,author,title,stock);
  }
    @Override
  public boolean equals(Object obj){
    if(this==obj) return true;
    if(obj==null || getClass()!=obj.getClass()) return false;
    Book book=(Book) obj;
    return isbn.equals(book.isbn) &&
           author.equals(book.author) &&
           title.equals(book.title) &&
           stock == book.stock;   //because stock is int
  }

  //displayInfo method
  public void displayInfo(){
    System.out.println("Title: "+this.title);
    System.out.println("Author: "+this.author);
    System.out.println("ISBN: "+this.isbn);
    System.out.println("Stock: "+this.stock);
  }

}