import java.util.ArrayList;
import java.util.Scanner;

public class GuestMenu {
    protected ArrayList<Book> library;
    Scanner sc = new Scanner(System.in);

    public GuestMenu(ArrayList<Book> library) {
        this.library = library;
    }

    public void showMenu() {
        System.out.println("----------------------GUEST MENU--------------------");
        System.out.println("1. Tìm kiếm sách");
        System.out.println("2. Xem danh sách");
        System.out.println("0. Thoát");
    }

    public String standard(String date) {
        StringBuilder sb = new StringBuilder(date);
        if(sb.charAt(1) == '/') sb.insert(0, '0');
        if(sb.charAt(4) == '/') sb.insert(3, '0');
        while(sb.length() < 10) sb.insert(6, '0');
        return sb.toString();
    }

    public void searchBook() {
        boolean found = false;
        String name = sc.nextLine();
        for(Book x : library) {
            if(x.getName().toLowerCase().equals(name.toLowerCase()) ||
                    x.getAuthor().toLowerCase().equals(name.toLowerCase()) ||
                    x.getGenre().toLowerCase().equals(name.toLowerCase()) || x.getDate().equals(standard(name)))
            {
                System.out.println(x);
                System.out.println();
                found = true;
            }
        }
        if(found == false) {
            System.out.println("Không tìm thấy sách!");
            System.out.println();
        }
    }

    public void showBook() {
        System.out.println("--------------------DANH SACH SACH------------------");
        System.out.printf("%-5s %-40s %-30s %-20s %-15s%n",
                "ID", "Name", "Author", "Genre", "Date");

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        for(Book x : library) {
            System.out.println(x);
        }
    }

    void process() {
        while(true) {
            showMenu();
            int x = sc.nextInt();
            sc.nextLine();
            if(x == 1) searchBook();
            else if(x == 2) {
                showBook();
                System.out.println();
            }
            else break;
        }
    }
}
