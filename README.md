This project is a simple Console-based Library Management System developed in Java. It allows a user to manage a collection of books by performing basic CRUD (Create, Read, Update, Delete) operations through a command-line interface. The system utilizes ArrayList for storing book objects and the Scanner class for user input.

Features
Add Book (Case 1): Allows the user to input the title, author, ISBN, and stock quantity for a new book and adds it to the list.
Delete Book (Case 2): Prompts the user for a book's title and author, searches the collection, and removes the matching book object.
Display All Books (Case 3): Lists the details (title, author, ISBN, stock) of every book currently in the library collection.
Exit (Case 4): Terminates the application.

Project Structure
The project consists of three main Java classes:
Book.java: Represents a single book entity with fields like title, author, isbn, and stock. It includes a constructor, getter/setter methods, a displayInfo() method, and overridden equals() and hashCode() methods for proper comparison within collections.
LibraryManager.java: Handles all core logic for managing the book collection. It holds the ArrayList<Book> and methods such as addBook(), deleteBook(), and displayBooks().
Main.java: Contains the main method. It initializes the LibraryManager object and runs the user-friendly menu loop that handles user input and calls the corresponding manager methods.

Prerequisites
Java Development Kit (JDK) 8 or newer.

An IDE (e.g., VS Code, IntelliJ, Eclipse) or command-line environment configured for Java.


Bu proje, Java ile geliştirilmiş basit, Konsol tabanlı bir Kütüphane Yönetim Sistemi'dir. Kullanıcının komut satırı arayüzü (CLI) aracılığıyla temel CRUD (Oluşturma, Okuma, Güncelleme, Silme) operasyonlarını gerçekleştirerek bir kitap koleksiyonunu yönetmesine olanak tanır. Sistem, kitap nesnelerini depolamak için ArrayList ve kullanıcı girdisi için Scanner sınıfını kullanır.

Özellikler
Kitap Ekle (Seçim 1): Kullanıcının yeni bir kitap için başlık, yazar, ISBN ve stok miktarını girmesini sağlar ve kitabı listeye ekler.
Kitap Sil (Seçim 2): Kullanıcıdan bir kitabın başlık ve yazarını ister, koleksiyonu arar ve eşleşen kitap nesnesini listeden kaldırır.
Tüm Kitapları Görüntüle (Seçim 3): Kütüphane koleksiyonunda bulunan tüm kitapların ayrıntılarını (başlık, yazar, ISBN, stok) listeler.
Çıkış (Seçim 4): Uygulamayı sonlandırır.

Proje Yapısı
Proje, üç ana Java sınıfından oluşmaktadır:
Book.java: title, author, isbn ve stock gibi alanlarla tek bir kitap varlığını temsil eder. Bir yapıcı metot (constructor), getter/setter metotları, bir displayInfo() metodu ve koleksiyonlar içinde doğru karşılaştırma için geçersiz kılınmış (@Override) equals() ve hashCode() metotlarını içerir.
LibraryManager.java: Kitap koleksiyonunu yönetmek için tüm temel mantığı yürütür. ArrayList<Book> listesini ve addBook(), deleteBook() ve displayBooks() gibi metotları barındırır.
Main.java: Ana metodu (main) içerir. LibraryManager nesnesini başlatır ve kullanıcı girdisini yöneten, ilgili yönetici metotlarını çağıran kullanıcı dostu menü döngüsünü çalıştırır.

Ön Koşullar
Java Geliştirme Kiti (JDK) 8 veya daha yenisi.

Java için yapılandırılmış bir IDE (örneğin, VS Code, IntelliJ, Eclipse) veya komut satırı ortamı.
