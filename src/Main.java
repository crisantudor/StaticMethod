public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Engine engine = new Engine("V8");
        Car car = new Car("Mustang", engine);
        System.out.println(car.getModel());
    }
}