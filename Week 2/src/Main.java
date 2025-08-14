import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void showMenu() {
        System.out.println("--------------------ĐĂNG NHẬP-------------------");
        System.out.println("1. ADMIN");
        System.out.println("2. USER");
        System.out.println("3. EXIT");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khởi tạo thư viện
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book(1, "Harry Potter", "J.K.Rowling", "Tiểu thuyết", "26/06/1997"));
        library.add(new Book(2, "Nàng tiên cá", "Hans Christian Andersen", "Truyện cổ tích", "07/04/1837"));
        Admin admin = new Admin(library, "mat khau la gi");
        Guest guest = new Guest(library);

        while(true) {
            showMenu();
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
                    admin.process();
                }
            }
            else if(x == 2) {
                guest.process();
            }
            else break;
        }
    }
}