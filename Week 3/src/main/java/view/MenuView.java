package view;

import java.util.Scanner;
import java.util.ArrayList;
import service.ProductService;
import model.product.Product;
import service.BookService;
import service.PencilService;
import service.PenService;
import service.NoteBookService;
import model.user.User;
import model.user.Role;

public class MenuView {
    private ProductService productService;
    private Scanner sc = new Scanner(System.in);

    public MenuView(ProductService productService) {
        this.productService = productService;
    }

    public void show(User user) {
        Outer:while(true) {
            System.out.println("0. Thoát");
            System.out.println("1. Tìm kiếm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            if(user.getRole().equals(Role.ADMIN)) {
                System.out.println("3. Thêm sản phẩm");
                System.out.println("4. Xóa sản phẩm");
                System.out.println("5. Chỉnh sửa sản phẩm");
            }
            int n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    productService.searchProduct();
                    break;
                case 2:
                    System.out.println("1. Hiển thị dạng bảng");
                    System.out.println("2. Hiển thị dạng danh sách");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    if(choice == 1) productService.showTable();
                    else productService.showList();
                    break;
                case 3:
                    System.out.println("Nhập loại sản phẩm cần thêm:");
                    System.out.println("1. Sách");
                    System.out.println("2. Vở");
                    System.out.println("3. Bút mực");
                    System.out.println("4. Bút chì");
                    int x = sc.nextInt();
                    sc.nextLine();
                    productService.addProduct(x);
                    System.out.println("Thêm thành công");
                    break;
                case 4:
                    System.out.println("Nhập số thứ tự sách cần xóa: ");
                    productService.removeProduct();
                    System.out.println("Xóa thành công");
                    break;
                case 5:
                    System.out.println("Nhập số thứ tự sách cần chỉnh sửa: ");
                    productService.updateProduct();
                    System.out.println("Sửa thành công");
                    break;
                default:
                    break Outer;
            }
        }
    }

}
