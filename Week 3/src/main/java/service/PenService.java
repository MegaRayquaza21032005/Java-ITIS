package service;

import common.Constant;
import model.product.Book;
import model.product.Pen;
import model.product.Pencil;
import model.product.Product;

import java.util.ArrayList;
import java.util.Scanner;
public class PenService extends ProductService{
    private static final Scanner sc = new Scanner(System.in);

    public PenService(ArrayList<Product> products) {
        super(products);
    }

    private Pen newPen() {
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
        System.out.print("Nhập loại mực: ");
        String inkType = sc.nextLine();
        System.out.print("Nhập độ mịn: ");
        String nibSize = sc.nextLine();
        return new Pen(name, price, brand, color, material, inkType, nibSize);
    }
    public void addPen() {
        Pen pen = this.newPen();
        this.products.add(pen);
    }

    public void updatePen(int idx) {
        Pen pen = this.newPen();
        this.products.set(idx - 1, pen);
    }
    public boolean searchPen(String name, Pen pen) {
        if(name.equals(pen.getName().toLowerCase())) return true;
        else if(name.equals(pen.getPrice())) return true;
        else if(name.equals(pen.getBrand().toLowerCase())) return true;
        else if(name.equals(pen.getColor().toLowerCase())) return true;
        else if(name.equals(pen.getMaterial().toLowerCase())) return true;
        else if(name.equals(pen.getInkType().toLowerCase())) return true;
        else if(name.equals(pen.getNibSize().toLowerCase())) return true;
        else return false;
    }
    public void show(Pen pen, int idx) {
        System.out.printf(Constant.constant, idx, pen.getName(), pen.getPrice(), pen.getBrand(),
                "- Màu sắc: " + pen.getColor());
        System.out.printf(Constant.cons, " ", " ", " ", " ",
                "- Chất liệu: " + pen.getMaterial());
        System.out.printf(Constant.cons, " ", " ", " ", " ",
                "- Loại mực: " + pen.getInkType());
        System.out.printf(Constant.cons, " ", " ", " ", " ",
                "- Độ mịn: " + pen.getNibSize());
    }

    public void show1(Pen pen, int idx) {
        System.out.println("STT: " + idx);
        System.out.println("Tên sản phẩm: " + pen.getName());
        System.out.println("Giá bán: " + pen.getPrice());
        System.out.println("Thương hiệu: " + pen.getBrand());
        System.out.println("Màu sắc: " + pen.getColor());
        System.out.println("Chất liệu: " + pen.getMaterial());
        System.out.println("Loại mực: " + pen.getInkType());
        System.out.println("Độ mịn: " + pen.getNibSize());
    }
}
