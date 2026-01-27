package Session3;

public class Session3_bai4 {
    public static int[]  sortBooks(int[] arr){
        int temp = 0;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        return arr;
    }
    public static void displayBooks(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        int [] number={4,2,3,1,10,8,7,6,9,5};
        sortBooks(number);
        displayBooks(number);


    }
}
