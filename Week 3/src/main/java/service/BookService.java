package service;


import model.product.Product;
import model.product.Book;
import common.Constant;
import java.util.ArrayList;
import java.util.Scanner;

public class BookService extends ProductService{

    private static final Scanner sc = new Scanner(System.in);

    public BookService(ArrayList<Product> products) {
        super(products);
    }

    private Book newBook() {
        System.out.println("Nhập thông tin sản phẩm cần thêm vào cửa hàng: ");
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá thành: ");
        String price = sc.nextLine();
        System.out.print("Nhập thương hiệu: ");
        String brand = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        String author = sc.nextLine();
        System.out.print("Nhập thể loại: ");
        String genre = sc.nextLine();
        System.out.print("Nhập ngày xuất bản: ");
        String publishDate = sc.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        String publisher = sc.nextLine();
        System.out.print("Nhập ngôn ngữ: ");
        String language = sc.nextLine();
        return new Book(name, price, brand, author, genre, publishDate, publisher, language);
    }

    public void addBook() {
        Book book = this.newBook();
        this.products.add(book);
    }

    public void updateBook(int idx) {
        Book book = this.newBook();
        this.products.set(idx - 1, book);
    }
    public void show(Book book, int idx) {
        System.out.printf(Constant.constant, idx, book.getName(), book.getPrice(), book.getBrand(),
                "- Tác giả: " + book.getAuthor());
        System.out.printf(Constant.cons, " ", " ", " ", " ",
                "- Thể loại: " + book.getGenre());
        System.out.printf(Constant.cons, " ", " ", " ", " ",
                "- Ngày xuất bản: " + book.getPublishDate());
        System.out.printf(Constant.cons, " ", " ", " ", " ",
                "- Nhà xuất bản: " + book.getPublisher());
        System.out.printf(Constant.cons, " ", " ", " ", " ",
                "- Ngôn ngữ: " + book.getLanguage());
    }
    public boolean searchBook(String name, Book book) {
        if(name.equals(book.getName().toLowerCase())) return true;
        else if(name.equals(book.getPrice())) return true;
        else if(name.equals(book.getBrand().toLowerCase())) return true;
        else if(name.equals(book.getAuthor().toLowerCase())) return true;
        else if(name.equals(book.getGenre().toLowerCase())) return true;
        else if(name.equals(book.getPublishDate().toLowerCase())) return true;
        else if(name.equals(book.getPublisher().toLowerCase())) return true;
        else if(name.equals(book.getLanguage().toLowerCase())) return true;
        else return false;
    }
    public void show1(Book book, int idx) {
        System.out.println("STT: " + idx);
        System.out.println("Tên sản phẩm: " + book.getName());
        System.out.println("Giá bán: " + book.getPrice());
        System.out.println("Thương hiệu: " + book.getBrand());
        System.out.println("Tác giả: " + book.getAuthor());
        System.out.println("Thể loại: " + book.getGenre());
        System.out.println("Ngày xuất bản: " + book.getPublishDate());
        System.out.println("Nhà xuất bản: " + book.getPublisher());
        System.out.println("Ngôn ngữ: " + book.getLanguage());
    }
}
