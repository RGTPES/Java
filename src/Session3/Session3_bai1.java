package Session3;

import java.util.Scanner;

public class Session3_bai1 {
    public static int[] addBook(int n) {
        Scanner sc = new Scanner(System.in);
        int[] book = new int[n];
        System.out.println("Nhap ma so cho " + n + " cuon sach");
        for(int i=0;i<n;i++){
            System.out.printf("Sach thu  %d: ", i+1 );
            book[i] = sc.nextInt();
        }
        sc.close();
        return book;
    }
    public static void displayLibraries(int[] arr) {
        System.out.println("--KET QUA--");
        System.out.print("Danh sach ma sach: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach can quan ly: ");
    int n = sc.nextInt();
    int[] libararies = addBook(n);
    displayLibraries(libararies);

    }
}
