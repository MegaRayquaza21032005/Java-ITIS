package view;
import model.user.User;
import service.LoginService;
import service.ProductService;

import java.util.Scanner;

public class LoginView {
    private LoginService loginService = new LoginService();
    private final Scanner sc = new Scanner(System.in);
    private ProductService productService;

    public LoginView(ProductService productService) {
        this.productService = productService;
    }

    public void show()
    {
        while(true) {
            System.out.println("Nhập 0 để thoát, 1 để tiếp tục đăng nhập!");
            int x = sc.nextInt();
            sc.nextLine();
            if(x == 0) break;
            System.out.print("Nhập username: ");
            String username = sc.nextLine();
            System.out.print("Nhập password: ");
            String password = sc.nextLine();
            User user = new User(username, password);
            if (loginService.checkLogin(user)) {
                MenuView menuView = new MenuView(productService);
                menuView.show(user);
            }
            else {
                System.out.println("Tài khoản hoặc mật khẩu không chính xác. Vui lòng thử lại!");
            }
        }
    }

}
