package Session8;

import java.util.Scanner;

class Student {

    private String id;
    private String name;
    private double score;

    public Student() {
        id = "";
        name = "";
        score = 0;
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRank() {
        if (score >= 8.0) {
            return "Gioi";
        } else if (score >= 6.5) {
            return "Kha";
        } else {
            return "Trung Binh";
        }
    }

    public String toString() {
        return "Ma: " + id + ", Ten: " + name + ", Diem: " + score + ", Hoc luc: " + getRank();
    }
}

public class Exam2 {

    static Scanner sc = new Scanner(System.in);
    static Student[] students = new Student[100];
    static int count = 0;

    public static void addStudent() {
        if (count >= students.length) {
            System.out.println("Danh sach day");
            return;
        }
        System.out.print("Nhap ma SV: ");
        String id = sc.nextLine();
        System.out.print("Nhap ten SV: ");
        String name = sc.nextLine();
        System.out.print("Nhap diem: ");
        double score = Double.parseDouble(sc.nextLine());
        students[count] = new Student(id, name, score);
        count++;
        System.out.println("Them thanh cong");
    }

    public static void displayStudents() {
        if (count == 0) {
            System.out.println("Danh sach rong");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    public static void searchByRank() {
        System.out.print("Nhap hoc luc can tim (Gioi/Kha/Trung Binh): ");
        String rank = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getRank().equalsIgnoreCase(rank)) {
                System.out.println(students[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay");
        }
    }

    public static void sortByRankDesc() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Da sap xep");
    }

    public static void main(String[] args) {
        String choice = "0";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("===QUẢN LÝ ĐIỂM SINH VIÊN===");
            System.out.println("1.Nhập danh sách sinh viên");
            System.out.println("2.Hiển thị danh sách sinh viên");
            System.out.println("3.Tìm kiếm sinh viên theo Học lực");
            System.out.println("4.Sắp xếp theo học lực giảm dần");
            System.out.println("5.Thoát");
            System.out.println("Chọn chức năng: ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    displayStudents();
                    break;
                case "3":
                    searchByRank();
                    break;
                case "4":
                    sortByRankDesc();
                    break;
            }
        } while (!choice.equals("5"));
    }
}
