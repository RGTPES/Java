package Session3;

import java.util.Scanner;

public class Session3_bai2 {
    public static int searchBooks(String[] arr, String search){
        int n = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(search)){
                n = i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        String[] Book = {"Doraemon","Conan","DoctorStrange","Marvel","Batman"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sach can tim: ");
        String n = sc.nextLine();
        int search = searchBooks(Book ,n);
        if(search == -1){
            System.out.println("Sach khong ton tai trong thu vien");
        }else{
            System.out.println("Tim thay sach " + n +" tai vi tri so: "+search);
        }
    }
}
