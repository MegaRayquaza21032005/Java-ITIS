import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        Admin admin = new Admin(library, "mat khau la gi");
        Guest guest = new Guest(library);
        LoginView loginView = new LoginView(library, admin, guest);

        library.add(new Book(1, "Harry Potter", "J.K.Rowling", "Tiểu thuyết", "26/06/1997"));
        library.add(new Book(2, "Nàng tiên cá", "Hans Christian Andersen", "Truyện cổ tích", "07/04/1837"));

        loginView.login();
    }
}