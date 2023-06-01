package task1;

public class Main {
    public static void main(String[] args) {
        Car ford = new Ford("Ford Mustang", 150.0, 170, 50000.0);
        Car mitsubishi = new Mitsubishi("Mitsubishi Lancer X", 160.0, 200, 45000.0);
        Car toyota = new Toyota("Toyota RAV-4", 170.0, 150, 25000.0);
        Car kia = new KIA("KIA Rio", 180.0, 160, 22000.0);
        CheckCar checkCar = new CheckCar();
        checkCar.addCar(ford);
        checkCar.addCar(mitsubishi);
        checkCar.addCar(toyota);
        checkCar.addCar(kia);
        System.out.println("--Max Speed Car--");
        System.out.println(checkCar.getMaxSpeedCar());
        System.out.println("--Max Price Car--");
        System.out.println(checkCar.getMaxPriceCar());
        System.out.println("--Max Power Car--");
        System.out.println(checkCar.getMaxPowerCar());
    }
}
