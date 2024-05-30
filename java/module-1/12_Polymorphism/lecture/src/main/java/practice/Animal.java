package practice;

public class Animal {
    public void speak(){
        System.out.println("Speak");
    }

    public static void main(String[] args) {
        Animal c = new Cat();
        c.speak();

        Animal d = new Dog();
        d.speak();
    }
}
