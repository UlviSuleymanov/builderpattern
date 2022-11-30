public final class Car {//immutable
    private String name;
    private int year;
    private String model;
    private Car(){

    }

    public Car(String name, int year, String model){
        this.year=year;
        this.name=name;
        this.model=model;
    }

    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public String getModel() {
        return model;
    }
    public static CarBuilder builder(){
        return new CarBuilder();
    }
    public static class CarBuilder{
        Car c = null;
        public CarBuilder(){
            c = new Car();
        }
        public CarBuilder carModel(String model){
            this.c.model=model;
            return this;
        }
        public CarBuilder carYear(int year){
            this.c.year=year;
            return this;
        }
        public CarBuilder carName(String name){
            this.c.name=name;
            return this;
        }
        public Car build(){
            return new Car(c.name,c.year, c.model);
        }

    }
}
