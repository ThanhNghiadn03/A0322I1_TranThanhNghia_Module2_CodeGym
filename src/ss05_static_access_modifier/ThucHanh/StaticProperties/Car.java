package ss05_static_access_modifier.ThucHanh.StaticProperties;

public class Car {
    private String name;
    private String engine;
    public static int numOfCar = 0;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        Car.numOfCar++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
