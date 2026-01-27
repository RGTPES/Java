package Session3;

public class Session3_bai3 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities){
       int max = quantities[0];
       for(int i=0;i<names.length;i++){
           if(quantities[i]>max){
               max = quantities[i];
           }
       }
        System.out.printf("Sach co so luong nhieu nhat (%d) \n",max);
        for(int i =0;i<quantities.length;i++){
            if(quantities[i]==max){
                System.out.println("-" + names[i] );
            }
        }
    }
    public static void minQuantityOfBooks(String[] names, int[] quantities){
        int min = quantities[0];
        for(int i=0;i<names.length;i++){
            if(quantities[i]<min){
                min = quantities[i];
            }
        }
        System.out.printf("Sach co so luong it nhat (%d) \n",min);
        for(int i =0;i<quantities.length;i++){
            if(quantities[i]==min){
                System.out.println("-" + names[i] );
            }
        }
    }
    public static void main(String[] args) {
        String[] Book = {"Doraemon","Conan","DoctorStrange","Marvel","Batman"};
        int[] quantity = {10,2,3,10,5};
        maxQuantityOfBooks(Book,quantity);
        minQuantityOfBooks(Book,quantity);
    }
}
