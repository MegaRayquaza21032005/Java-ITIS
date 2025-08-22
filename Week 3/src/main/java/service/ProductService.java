package service;

import java.util.ArrayList;
import model.product.Product;
import model.product.Book;
import model.product.Pencil;
import model.product.Pen;
import model.product.NoteBook;
import common.Constant;

public class ProductService {
    protected ArrayList<Product> products = new ArrayList<>();
    private static final java.util.Scanner sc = new java.util.Scanner(System.in);

    public ProductService(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> findAll() {
        return products;
    }

    public void addProduct(int i) {
        if(i == 1) {
            BookService bookService = new BookService(products);
            bookService.addBook();
        }
        else if(i == 2) {
            NoteBookService noteBookService = new NoteBookService(products);
            noteBookService.addNoteBook();
        }
        else if(i == 3) {
            PenService penService = new PenService(products);
            penService.addPen();
        }
        else if(i == 4) {
            PencilService pencilService = new PencilService(products);
            pencilService.addPencil();
        }
    }

    public void removeProduct() {
        int idx = sc.nextInt();
        sc.nextLine();
        this.products.remove(idx - 1);
    }

    public void updateProduct() {
        int idx = sc.nextInt();
        sc.nextLine();
        Product product = this.products.get(idx - 1);
        if(product instanceof Book) {
            BookService bookService = new BookService(products);
            bookService.updateBook(idx);
        }
        else if(product instanceof Pencil) {
            PencilService pencilService = new PencilService(products);
            pencilService.updatePencil(idx);
        }
        else if(product instanceof Pen) {
            PenService penService = new PenService(products);
            penService.updatePen(idx);
        }
        else if(product instanceof NoteBook) {
            NoteBookService noteBookService = new NoteBookService(products);
            noteBookService.updateNoteBook(idx);
        }
    }
    public void searchProduct() {
        System.out.print("Nhập từ khóa tìm kiếm: ");
        String name = sc.nextLine().toLowerCase();
        System.out.println("1. Hiển thị dạng bảng");
        System.out.println("2. Hiển thị dạng danh sách");
        int choice = sc.nextInt();
        sc.nextLine();
        if(choice == 1)
        {
            System.out.printf(Constant.cons, "STT", "Tên sản phẩm", "Giá bán", "Thương hiệu", "Thông tin thêm");
            System.out.println("______________________________________________________________________________________________");
            for(Product product : products) {
                if (product instanceof Book) {
                    BookService bookService = new BookService(products);
                    if (bookService.searchBook(name, (Book) product)) {
                        bookService.show((Book) product, products.indexOf(product) + 1);
                        System.out.println("______________________________________________________________________________________________");
                    }
                } else if (product instanceof Pencil) {
                    PencilService pencilService = new PencilService(products);
                    if (pencilService.searchPencil(name, (Pencil) product)) {
                        pencilService.show((Pencil) product, products.indexOf(product) + 1);
                        System.out.println("______________________________________________________________________________________________");
                    }
                } else if (product instanceof Pen) {
                    PenService penService = new PenService(products);
                    if (penService.searchPen(name, (Pen) product)) {
                        penService.show((Pen) product, products.indexOf(product) + 1);
                        System.out.println("______________________________________________________________________________________________");
                    }
                } else if (product instanceof NoteBook) {
                    NoteBookService noteBookService = new NoteBookService(products);
                    if (noteBookService.searchNotebook(name, (NoteBook) product)) {
                        noteBookService.show((NoteBook) product, products.indexOf(product) + 1);
                        System.out.println("______________________________________________________________________________________________");
                    }
                } else System.out.println("Không tìm thấy sản phẩm!");
            }
        }
        else if(choice == 2)
        {
            for(Product product : products) {
                if (product instanceof Book) {
                    BookService bookService = new BookService(products);
                    if (bookService.searchBook(name, (Book) product)) {
                        bookService.show1((Book) product, products.indexOf(product) + 1);
                        System.out.println("______________________________________________________________________________________________");
                    }
                } else if (product instanceof Pencil) {
                    PencilService pencilService = new PencilService(products);
                    if (pencilService.searchPencil(name, (Pencil) product)) {
                        pencilService.show1((Pencil) product, products.indexOf(product) + 1);
                        System.out.println("______________________________________________________________________________________________");
                    }
                } else if (product instanceof Pen) {
                    PenService penService = new PenService(products);
                    if (penService.searchPen(name, (Pen) product)) {
                        penService.show1((Pen) product, products.indexOf(product) + 1);
                        System.out.println("______________________________________________________________________________________________");
                    }
                } else if (product instanceof NoteBook) {
                    NoteBookService noteBookService = new NoteBookService(products);
                    if (noteBookService.searchNotebook(name, (NoteBook) product)) {
                        noteBookService.show1((NoteBook) product, products.indexOf(product) + 1);
                        System.out.println("______________________________________________________________________________________________");
                    }
                } else System.out.println("Không tìm thấy sản phẩm!");
            }
        }
    }
    public void showTable() {
        System.out.printf(Constant.cons, "STT", "Tên sản phẩm", "Giá bán", "Thương hiệu", "Thông tin thêm");
        System.out.println("______________________________________________________________________________________________");
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i) instanceof Book) {
                BookService bookService = new BookService(products);
                bookService.show((Book) products.get(i), i + 1);
            }
            else if(products.get(i) instanceof Pencil) {
                PencilService pencilService = new PencilService(products);
                pencilService.show((Pencil) products.get(i), i + 1);
            }
            else if(products.get(i) instanceof Pen) {
                PenService penService = new PenService(products);
                penService.show((Pen) products.get(i), i + 1);
            }
            else if(products.get(i) instanceof NoteBook) {
                NoteBookService noteBookService = new NoteBookService(products);
                noteBookService.show((NoteBook) products.get(i), i + 1);
            }
            System.out.println("______________________________________________________________________________________________");
        }
    }

    public void showList() {
        System.out.println("Danh sách sản phẩm: ");
        System.out.println("______________________________________________________________________________________________");
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i) instanceof Book) {
                BookService bookService = new BookService(products);
                bookService.show1((Book) products.get(i), i + 1);
            }
            else if(products.get(i) instanceof Pencil) {
                PencilService pencilService = new PencilService(products);
                pencilService.show1((Pencil) products.get(i), i + 1);
            }
            else if(products.get(i) instanceof Pen) {
                PenService penService = new PenService(products);
                penService.show1((Pen) products.get(i), i + 1);
            }
            else if(products.get(i) instanceof NoteBook) {
                NoteBookService noteBookService = new NoteBookService(products);
                noteBookService.show1((NoteBook) products.get(i), i + 1);
            }
            System.out.println("______________________________________________________________________________________________");
        }
    }
}
