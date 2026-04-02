public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("GLE", "Mercedes", 2020, 350000, "white", 5);
        Car car2 = new Car("GLE", "Mercedes", 2020, 350000, "white", 5);

        System.out.println(car1);
        System.out.println(car2.getColor());

        int y = car1.getYear();
        car1.setColor("black");

        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("HashCode car1: " + car1.hashCode());
        System.out.println("HashCode car2: " + car2.hashCode());
    }
}