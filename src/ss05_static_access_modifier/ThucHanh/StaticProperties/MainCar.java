package ss05_static_access_modifier.ThucHanh.StaticProperties;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.printf(Car.numOfCar+"");
    }
}
