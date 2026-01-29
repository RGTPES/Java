package Session5;

import java.util.Scanner;

public class miniPrJ1 {

    public static int[] Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng phần tử trong mảng");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            System.out.printf("Mời bạn nhập số thứ %d\n",i+1 );
            arr[i] = sc.nextInt();
        }
        return arr;
    };
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void twoSum() {
        int[] arr = Input();
        System.out.println("Mời bạn nhập target: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Tìm thấy tại vị trí: " + i + " và " + j);
                    found = true;

                }
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy ");
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String choice;
        do {
            System.out.println("\n========== MENU CHINH ==========");
            System.out.println("1. Two Sum");
            System.out.println("2. Move Zeroes");
            System.out.println("3. Valid Palindrome");
            System.out.println("4. Reverse Words");
            System.out.println("5. Happy Number");
            System.out.println("0. Thoat");
            System.out.println("================================");
            System.out.print("Chon chuc nang: ");

            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    twoSum();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "0":
                    System.out.println("Thoat chuong trinh. Bye!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != "0");
    }


}