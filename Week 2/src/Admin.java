import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Guest {
    private String password;
    private Scanner sc = new Scanner(System.in);

    public Admin(ArrayList<Book> library, String password) {
        super(library);
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
