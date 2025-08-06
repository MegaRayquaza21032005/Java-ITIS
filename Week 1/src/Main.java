import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        StudentManager sm = new StudentManager();
        for(int i = 0; i < n; ++i) {
            sm.listStudent.add(sm.input());
        }
        int q = sc.nextInt();
        while(q-- > 0) {
            int i = sc.nextInt();
            sm.print(sm.listStudent.get(i - 1));
        }
    }
}

/*
3
Nguyen Thanh Dat
20
Hanoi
10,0
9,75
9,5
Nguyen Van A
18
Haiphong
8,75
6,5
5
Hoang Ngoc C
15
Thanhhoa
9,75
8,25
8
 */