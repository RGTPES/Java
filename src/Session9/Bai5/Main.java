package Session9.Bai5;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new OfficeEmployee("Mai Van Huy", 10000000);
        employees[1] = new ProductionEmployee("Dinh Dinh Thanh", 300, 20000);
        employees[2] = new ProductionEmployee("Dinh Trong An", 150, 30000);

        int total = 0;

        System.out.println("Danh sach luong nhan vien:");

        for (int i = 0; i < employees.length; i++) {
            int salary = employees[i].calculateSalary();
            total += salary;

            System.out.println((i + 1) + employees[i].name + " - Lương: " + salary
            );
        }

        System.out.println("Tong luong cong ty: " + total);
    }
}
