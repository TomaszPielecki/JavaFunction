class Car {
    private String name, manufacturer, model;
    private int year;

    public Car (String name, String manufacturer, String model, int year) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;

    }
    public String getName(){
        return name;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setName (String name){
        this.name=name;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer=manufacturer;
    }

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

public class ArrayListIterations {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Focus", "Mk3", 2009);
        car.setYear(2007);
        Car carTwo = new Car("Ford", "Focus", "Mk1", 2000);
        Car carThree = new Car("Ford", "Focus", "Mk2", 2006);
        Car carFour = new Car("Ford", "Focus", "Mk4", 2010);

        System.out.println("Moj samochod" + car);
        System.out.println("Moj samochod" + carTwo);
        System.out.println("Moj samochod" + carThree);
        System.out.println("Moj samochod" + carFour);
    }
}
