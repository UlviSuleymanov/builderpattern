
public class Main {
    public static void main(String[] args) {
        Car.CarBuilder c = new Car.CarBuilder();
        c.carModel("X5");
        c.carName("BMW");
        c.carYear(1999);
        Car car=c.build();
        System.out.println(car.getName()+" "+car.getModel()+" "+car.getYear());
    }
}