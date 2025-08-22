package service;

import common.Constant;
import model.product.Book;
import model.product.Pencil;
import model.product.Product;

import java.util.ArrayList;
import java.util.Scanner;
public class PencilService extends ProductService{
    private static final Scanner sc = new Scanner(System.in);

    public PencilService(ArrayList<Product> products) {
        super(products);
    }

    private Pencil newPencil() {
        System.out.println("Nhập thông tin sản phẩm cần thêm vào cửa hàng: ");
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá thành: ");
        String price = sc.nextLine();
        System.out.print("Nhập thương hiệu: ");
        String brand = sc.nextLine();
        System.out.print("Nhập màu sắc: ");
        String color = sc.nextLine();
        System.out.print("Nhập chất liệu: ");
        String material = sc.nextLine();
        System.out.print("Nhập độ dày: ");
        String hardness = sc.nextLine();
        return new Pencil(name, price, brand, color, material, hardness);
    }
    public void addPencil() {
        Pencil pencil = this.newPencil();
        this.products.add(pencil);
    }

    public void updatePencil(int idx) {
        Pencil pencil = this.newPencil();
        this.products.set(idx - 1, pencil);
    }
    public boolean searchPencil(String name, Pencil pencil) {
        if(name.equals(pencil.getName().toLowerCase())) return true;
        else if(name.equals(pencil.getPrice())) return true;
        else if(name.equals(pencil.getBrand().toLowerCase())) return true;
        else if(name.equals(pencil.getColor().toLowerCase())) return true;
        else if(name.equals(pencil.getMaterial().toLowerCase())) return true;
        else if(name.equals(pencil.getHardness().toLowerCase())) return true;
        else return false;
    }
    public void show(Pencil pencil, int idx) {
        System.out.printf(Constant.constant, idx, pencil.getName(), pencil.getPrice(), pencil.getBrand(),
                "- Màu sắc: " + pencil.getColor());
        System.out.printf(Constant.cons, " ", " ", " ", " ",
                "- Chất liệu: " + pencil.getMaterial());
        System.out.printf(Constant.cons, " ", " ", " ", " ",
                "- Độ dày: " + pencil.getHardness());
    }

    public void show1(Pencil pencil, int idx) {
        System.out.println("STT: " + idx);
        System.out.println("Tên sản phẩm: " + pencil.getName());
        System.out.println("Giá bán: " + pencil.getPrice());
        System.out.println("Thương hiệu: " + pencil.getBrand());
        System.out.println("Màu sắc: " + pencil.getColor());
        System.out.println("Chất liệu: " + pencil.getMaterial());
        System.out.println("Độ dày: " + pencil.getHardness());
    }
}
