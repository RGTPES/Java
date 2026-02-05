package Session9.Bai5;



public abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract int calculateSalary();
}