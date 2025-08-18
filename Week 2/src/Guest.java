import java.util.ArrayList;
import java.util.Scanner;

public class Guest {
    protected ArrayList<Book> library = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public Guest(ArrayList<Book> library) {
           this.library = library;
    }
}
