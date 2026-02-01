package Session5;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);

    public static void menu(String[] student, int count) {
        String choice;
        do {
            System.out.println("1.Display");
            System.out.println("2.Add Student");
            System.out.println("3.Update Student");
            System.out.println("4.Delete Student");
            System.out.println("5.Search Student");
            System.out.println("6.Exit");
            System.out.print("Mời bạn nhập lựa chọn: ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    Display(student, count);
                    break;
                case "2":
                    count = Add(student, count);
                    break;
                case "3":
                    System.out.println("Moi bạn nhập index để sửa");
                    int index = sc.nextInt();
                    UpdateStudent(student, count, index);
                    break;
                case "4":
                    count = DeleteStudent(student, count);
                    break;
                case "5":
                    SearchStudent(student, count);
                    break;
                case "6":
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Mời bạn chọn lại");
            }
        } while (!choice.equals("6"));
    }
    public static void Display(String[] list, int count) {
        if (count == 0) {
            System.out.println("Mảng rỗng");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + list[i]);
        }
    }
    public static void UpdateStudent(String[] list, int count, int index) {
        String regex = "^B\\d{7}$";
        if (count == 0) {
            System.out.println("Mảng rỗng");
            return;
        }
        if (index < 0 || index >= count) {
            System.out.println("Index không hợp lệ");
            return;
        }
        while (true) {
            System.out.print("Mời bạn nhập lại MSSV: ");
            String newStudentID = sc.nextLine();
            if (newStudentID.matches(regex)) {
                list[index] = newStudentID;
                System.out.println("Sửa thành công");
                break;
            } else {
                System.out.println("Sai định dạng MSSV ");
            }
        }
    }
    public static int DeleteStudent(String[] list, int count) {
        if (count == 0) {
            System.out.println("Danh sách rỗng");
            return count;
        }
        String regex = "^B\\d{7}$";
        System.out.print("Nhập MSSV cần xóa: ");
        String id = sc.nextLine();
        if (!id.matches(regex)) {
            System.out.println("Sai định dạng MSSV");
            return count;
        }
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (id.equals(list[i])) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Không tìm thấy MSSV cần xóa");
            return count;
        }
        for (int i = index; i < count - 1; i++) {
            list[i] = list[i + 1];
        }
        list[count - 1] = null;
        count--;
        System.out.println("Xóa thành công");
        return count;
    }
    public static void SearchStudent(String[] list, int count) {
        if (count == 0) {
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.print("Nhập chuỗi cần tìm: ");
        String key = sc.nextLine().trim();
        if (key.isEmpty()) {
            System.out.println("Chuỗi tìm kiếm rỗng");
            return;
        }
        String pattern = ".*" + key + ".*";
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (list[i] != null && list[i].toLowerCase().matches(pattern.toLowerCase())) {
                System.out.println((i + 1) + ". " + list[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy MSSV phù hợp");
        }
    }
    public static int Add(String[] list, int count) {
        String regex = "^B\\d{7}$";
        System.out.print("Mời bạn nhập MSSV mới: ");
        String id = sc.nextLine();
        if (id.matches(regex)) {
            list[count] = id;
            System.out.println("Thêm thành công");
            return count + 1;
        } else {
            System.out.println("MSSV không hợp lệ");
            return count;
        }
    }
    public static void main(String[] args) {
        String[] student = new String[100];
        int count = 0;
        menu(student, count);
        sc.close();
    }
}