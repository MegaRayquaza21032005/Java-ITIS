package service;

import java.util.ArrayList;
import java.util.Scanner;

import common.Constant;
import model.product.Book;
import model.product.Product;
import model.product.NoteBook;

public class NoteBookService extends ProductService{

    private static final Scanner sc = new Scanner(System.in);

    public NoteBookService(ArrayList<Product> products) {
        super(products);
    }

    private NoteBook newNoteBook() {
        System.out.println("Nhập thông tin sản phẩm cần thêm vào cửa hàng: ");
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá thành: ");
        String price = sc.nextLine();
        System.out.print("Nhập thương hiệu: ");
        String brand = sc.nextLine();
        System.out.print("Nhập số trang: ");
        String numberOfPages = sc.nextLine();
        System.out.print("Nhập loại vở: ");
        String notebookType = sc.nextLine();
        System.out.print("Nhập màu bìa: ");
        String coverColor = sc.nextLine();
        System.out.print("Nhập chất liệu giấy: ");
        String paperMaterial = sc.nextLine();
        System.out.println("Nhập kích thước vở: ");
        String size = sc.nextLine();
        return new NoteBook(name, price, brand, numberOfPages, notebookType, coverColor, paperMaterial, size);
    }
    public void addNoteBook() {
        NoteBook notebook = this.newNoteBook();
        this.products.add(notebook);
    }
    public void updateNoteBook(int idx) {
        NoteBook notebook = this.newNoteBook();
        this.products.set(idx - 1, notebook);
    }

    public boolean searchNotebook(String name, NoteBook notebook) {
        if(name.equals(notebook.getName().toLowerCase())) return true;
        else if(name.equals(notebook.getPrice())) return true;
        else if(name.equals(notebook.getBrand().toLowerCase())) return true;
        else if(name.equals(notebook.getNumberOfPages())) return true;
        else if(name.equals(notebook.getNotebookType().toLowerCase())) return true;
        else if(name.equals(notebook.getCoverColor().toLowerCase())) return true;
        else if(name.equals(notebook.getPaperMaterial().toLowerCase())) return true;
        else if(name.equals(notebook.getSize().toLowerCase())) return true;
        else return false;
    }
    public void show(NoteBook notebook, int idx) {
        System.out.printf(Constant.constant, idx, notebook.getName(), notebook.getPrice(), notebook.getBrand(),
                "- Số trang: " + notebook.getNumberOfPages());
        System.out.printf(Constant.cons, " ", " ", " ", " ",
                "- Loại vở: " + notebook.getNotebookType());
        System.out.printf(Constant.cons, " ", " ", " ", " ",
                "- Màu bìa: " + notebook.getCoverColor());
        System.out.printf(Constant.cons, " ", " ", " ", " ",
                "- Chất liệu giấy: " + notebook.getPaperMaterial());
        System.out.printf(Constant.cons, " ", " ", " ", " ",
                "- Kích thước: " + notebook.getSize());
    }

    public void show1(NoteBook notebook, int idx) {
        System.out.println("STT: " + idx);
        System.out.println("Tên sản phẩm: " + notebook.getName());
        System.out.println("Giá bán: " + notebook.getPrice());
        System.out.println("Thương hiệu: " + notebook.getBrand());
        System.out.println("Số trang: " + notebook.getNumberOfPages());
        System.out.println("Loại vở: " + notebook.getNotebookType());
        System.out.println("Màu bìa: " + notebook.getCoverColor());
        System.out.println("Chất liệu giấy: " + notebook.getPaperMaterial());
        System.out.println("Kích thước vở: " + notebook.getSize());
    }
}
