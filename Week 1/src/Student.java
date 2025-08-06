public class Student {
    String name, address;
    int age;
    double math, lit, eng;

    public Student(String name, int age, String address, double math, double lit, double eng) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.math = math;
        this.lit = lit;
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public double getMath() {
        return math;
    }

    public double getLit() {
        return lit;
    }

    public double getEng() {
        return eng;
    }
}
