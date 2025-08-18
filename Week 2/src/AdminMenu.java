import java.util.ArrayList;
import java.util.Scanner;

public class AdminMenu extends GuestMenu{
    Scanner sc = new Scanner(System.in);

    public AdminMenu(ArrayList library) {
        super(library);
    }

    @Override
    public void showMenu() {
        System.out.println("--------------------ADMIN MENU------------------");
        System.out.println("1. Thêm sách mới");
        System.out.println("2. Xóa sách");
        System.out.println("3. Sửa sách");
        System.out.println("4. Tìm kiếm sách");
        System.out.println("5. Xem danh sách");
        System.out.println("0. Thoát");
    }

    public void addBook() {
        System.out.println("Nhập thông tin sách cần thêm vào thư viện: ");
        System.out.print("Nhập tên sách: ");
        String name = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        String author = sc.nextLine();
        System.out.print("Nhập thể loại: ");
        String genre = sc.nextLine();
        System.out.print("Nhập ngày xuất bản: ");
        String date = sc.nextLine();
        Book x = new Book(this.library.size() + 1, name, author, genre, standard(date));
        this.library.add(x);
    }

    public void deleteBook() {
        System.out.println("Nhập số thứ tự sách cần xóa khỏi thư viện: ");
        int stt = sc.nextInt();
        sc.nextLine();
        if(stt <= 0 || stt > this.library.size()) System.out.println("Sách không tồn tại!");
        else {
//            for(int i = stt; i < this.library.size(); ++i) {
//                this.library.get(i - 1).setId(i);
//            }
            this.library.remove(stt - 1);
        }
    }

    public void editBook() {
        System.out.println("Nhập số thứ tự sách cần sửa: ");
        int stt = sc.nextInt();
        sc.nextLine();
        if(stt <= 0 || stt > this.library.size()) System.out.println("Sách không tồn tại!");
        else {
            System.out.print("Nhập tên sách: ");
            String name = sc.nextLine();
            System.out.print("Nhập tác giả: ");
            String author = sc.nextLine();
            System.out.print("Nhập thể loại: ");
            String genre = sc.nextLine();
            System.out.print("Nhập ngày xuất bản: ");
            String date = sc.nextLine();
            this.library.set(stt - 1, new Book(stt, name, author, genre, date));
        }
    }
    @Override
    public void process() {
        while (true) {
            this.showMenu();
            int x = sc.nextInt();
            sc.nextLine();
            if (x == 1) addBook();
            else if (x == 2) deleteBook();
            else if (x == 3) editBook();
            else if (x == 4) searchBook();
            else if (x == 5) {
                showBook();
                System.out.println();
            } else break;
        }
    }
}
