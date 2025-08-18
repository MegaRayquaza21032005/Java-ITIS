import java.util.Scanner;
import java.util.ArrayList;

public class LoginView {
    private ArrayList<Book> library;
    Scanner sc = new Scanner(System.in);
    private Admin admin;
    private Guest guest;

    public LoginView(ArrayList<Book> library, Admin admin, Guest guest) {
        this.library = library;
        this.admin = admin;
        this.guest = guest;
    }

    public LoginView(ArrayList<Book> library) {
        this.library = library;
    }

    public void showLoginMenu() {
        System.out.println("--------------------ĐĂNG NHẬP-------------------");
        System.out.println("1. ADMIN");
        System.out.println("2. USER");
        System.out.println("3. EXIT");
    }

    public void login() {
        while(true) {
            showLoginMenu();
            int x = sc.nextInt();
            sc.nextLine();
            if (x == 1) {
                System.out.print("Nhập mật khẩu: ");
                String password = sc.nextLine();
                while(password.equals(admin.getPassword()) == false) {
                    System.out.println("Mật khẩu sai, vui lòng thử lại!");
                    System.out.println("Nhập 0 để thoát");
                    System.out.print("Nhập lại mật khẩu: ");
                    password = sc.nextLine();
                    if(password.equals("0")) break;
                }
                if(password.equals(admin.getPassword())) {
                    AdminMenu am = new AdminMenu(library);
                    am.process();
                }
            }
            else if(x == 2) {
                GuestMenu gm = new GuestMenu(library);
                gm.process();
            }
            else break;
        }
    }
}
