package ptit.edu.vn;

import model.product.Book;
import model.product.Pencil;
import model.product.Pen;
import model.product.NoteBook;
import model.product.Product;
import service.ProductService;
import view.LoginView;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Pencil("Bút chì", "5000", "Thiên Long", "Đen", "Gỗ", "HB"));
        products.add(new Pen("Bút bi", "10000", "Thiên Long", "Đen", "Nhựa", "Mực dầu", "0.5mm"));
        products.add(new Book("Sách kí ức đen", "50000", "Kim Đồng", "Nguyễn Nhật Ánh", "Tiểu thuyết", "2010", "Kim Đồng", "Tiếng Việt"));
        products.add(new Book("Sách đắc nhân vật", "100000", "NXB trẻ", "Dale Carnegie", "Kĩ năng sống", "2010", "NXB Đồng Đen", "Tiếng Anh"));

        ProductService productService = new ProductService(products);

        LoginView loginView = new LoginView(productService);
        loginView.show();
    }
}