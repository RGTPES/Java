package Session9.Bai5;

public class ProductionEmployee extends Employee {
    int number;
    int price;

    ProductionEmployee(String name, int number, int price) {
        super(name);
        this.number = number;
        this.price = price;
    }

    int calculateSalary() {
        return number * price;
    }
}
