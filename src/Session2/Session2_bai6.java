package Session2;

import java.util.Scanner;

public class Session2_bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap luot muon ngay thu 1: ");
        int choice = sc.nextInt();

        int max = choice;
        int min = choice;
        int total = choice;

        for (int i = 2; i <= 7; i++) {
            System.out.print("Nhap luot muon ngay thu " + i + ": ");
            choice = sc.nextInt();

            if (choice > max) {
                max = choice;
            }
            if (choice < min) {
                min = choice;
            }
            total += choice;
        }

        double avg = total / 7.0;

        System.out.println("\n--KET QUA THONG KE--");
        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);
        System.out.println("Trung binh luot muon/ngay: " + avg);

        sc.close();
    }
}
