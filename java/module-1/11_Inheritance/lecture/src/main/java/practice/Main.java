package practice;

public class Main {

    public static void main(String[] args) {
        /*Student student1 = new Student("John",123);
        Student student2 = new Student("Mary", 124);
        Student student3 = new Student("Eric", 125);
        System.out.println(Student.getStudentCount());*/

        Car car = new Car(20.0,"Black");
        car.report();

        Truck truck = new Truck(100.0,"White");
        truck.report();
        truck.cargoContainer();
    }
}
