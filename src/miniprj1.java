import java.util.Scanner;

public class miniprj1 {
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
    public static void TwoSum() {
    }
    public static void main(String[] args) {
    int[]a =Input();


    }
}
