package Session9.Bai1;
public class Student extends Person{
    private String Masv;
    private double diem;
    public Student(String Masv,double diem,String Name,int age){
        super(Name,age);
        this.diem=diem;
        this.Masv=Masv;
    }
    public void display(){
        super.display();
        System.out.println("Masv: "+Masv);
        System.out.println("Diem: "+diem);
    }
}
