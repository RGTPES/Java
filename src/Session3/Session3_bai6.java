package Session3;
import java.util.Arrays;
public class Session3_bai6 {
    public static int[] mergeBooks(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            merged[index++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merged[index++] = b[i];
        }
        Arrays.sort(merged);
        int uniqueCount = 1;
        for (int i = 1; i < merged.length; i++) {
            if (merged[i] != merged[i - 1]) {
                uniqueCount++;
            }
        }
        int[] newArray = new int[uniqueCount];
        newArray[0] = merged[0];
        int j = 1;
        for (int i = 1; i < merged.length; i++) {
            if (merged[i] != merged[i - 1]) {
                newArray[j++] = merged[i];
            }
        }
        return newArray;
    }

    public static void displayBooks(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }


    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 6, 7, 8, 5, 9};
        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);
        System.out.println();
        System.out.print("Kho cu: ");
        displayBooks(arrayFirst);
        System.out.println();
        System.out.print("Lo moi: ");
        displayBooks(arraySecond);
        System.out.println();
        System.out.print("Kho tong: ");
        displayBooks(arrayMerge);
        System.out.println();
    }
}

