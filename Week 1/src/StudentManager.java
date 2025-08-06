import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> listStudent = new ArrayList<>();

    public Student input() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        //sc.nextLine();
        String address = sc.nextLine();
        double math = Double.parseDouble(sc.nextLine());
        double lit = Double.parseDouble(sc.nextLine());
        double eng = Double.parseDouble(sc.nextLine());
        //sc.nextLine();
        Student x = new Student(name, age, address, math, lit, eng);
        return x;
    }

    public double average(Student x) {
        return (x.getMath() + x.getLit() + x.getEng()) / 3;
    }

    public String getHocLuc(Student x) {
        double avg = average(x);
        if(avg >= 8) return "Xuat sac";
        else if(avg >= 7) return "Gioi";
        else if(avg >= 6) return "Kha";
        else if(avg >= 5) return "Trung binh";
        else return "Yeu";
    }

    public void print(Student x) {
        System.out.println(x.getName() + " " + x.getAge() + " " + x.getAddress() + " " +
                x.getMath() + " " + x.getLit() + " " + x.getEng() + " " + average(x) + " " + getHocLuc(x));
    }
}
