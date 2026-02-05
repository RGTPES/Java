package Session9.Bai4;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.Sounds();
        if(animal instanceof Dog){
            Dog dog=(Dog) animal;
            dog.step();
        }
    }
}
