package task1;

 abstract class Car {
    private String model;
    private double power;
    private int speed;
    private double price;
    private final int yearOfManufacture = 1967;

    public Car(String model, double power, int speed, double price){
        this.model = model;
        this.power = checkPower(power);
        this.speed = checkSpeed(speed);
        this.price = checkPrice(price);
    }

    private double checkPower(double power){
        if (power > 200.0){
            return 200.0;
        }else if (power < 0.0) {
            return 0.0;
        }
        return power;
    }

    private int checkSpeed(int speed){
        if (speed > 320){
            return 320;
        }else if (speed < 0) {
            return 0;
        }
        return speed;
    }

    private double checkPrice(double price){
        if (price > 50000.0){
            return 50000.0;
        }else if (price < 0.0) {
            return 0.0;
        }
        return price;
    }

     public String getModel() {
         return model;
     }

     public double getPower() {
         return power;
     }

     public int getSpeed() {
         return speed;
     }

     public double getPrice() {
         return price;
     }

     public int getYearOfManufacture() {
         return yearOfManufacture;
     }

     @Override
     public String toString() {
         return "Brand: " + getModel() + "\n" +
                 "Power: " + (int) getPower() + "\n" +
                 "Speed: " + getSpeed() + "\n" +
                 "Price: " + getPrice() + "\n" +
                 "Year: " + getYearOfManufacture();
     }
 }
