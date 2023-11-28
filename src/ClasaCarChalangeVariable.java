class CarVariable {
    byte numberOfTires;
    short mileage;
    int engineCapacity;
    double fuelConsumption;
    boolean isUsed;

    public CarVariable(byte numberOfTires, short mileage, int engineCapacity, double fuelConsumption, boolean isUsed) {
        this.numberOfTires = numberOfTires;
        this.mileage = mileage;
        this.engineCapacity = engineCapacity;
        this.fuelConsumption = fuelConsumption;
        this.isUsed = isUsed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfTires=" + numberOfTires +
                ", mileage=" + mileage +
                ", engineCapacity=" + engineCapacity +
                ", fuelConsumption=" + fuelConsumption +
                ", isUsed=" + isUsed +
                '}';
    }
}

class Cars {
    public static void main(String[] args) {
        CarVariable carOne = new CarVariable((byte)4, (short)122, 1500, 8.5d, true);
        CarVariable carTwo = new CarVariable((byte)6, (short)180, 2500, 12.5d, true);
        System.out.println(carOne);
        System.out.println(carTwo);
    }
}
