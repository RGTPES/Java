package Session9.Bai5;

public class OfficeEmployee extends Employee {
    int baseSalary;

    OfficeEmployee(String name, int baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    int calculateSalary() {
        return baseSalary;
    }
}
