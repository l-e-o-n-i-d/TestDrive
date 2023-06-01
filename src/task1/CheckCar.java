package task1;

public class CheckCar {
    private Car[] cars = new Car[0];

    public void addCar(Car car){
        Car[] result = new Car[cars.length +1];

        for (int i = 0; i < cars.length; i++) {
            result[i] = cars[i];
        }
        result[result.length-1] = car;
        cars = result;
    }

    public Car getMaxSpeedCar(){
        Car maxSpeedCar = cars[0];
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getSpeed() > maxSpeedCar.getSpeed()) {
                maxSpeedCar = cars[i];
            }
        }
        return maxSpeedCar;
    }

    public Car getMaxPriceCar(){
        Car maxPriceCar = cars[0];
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPrice() > maxPriceCar.getPrice()) {
                maxPriceCar = cars[i];
            }
        }
        return maxPriceCar;
    }

    public Car getMaxPowerCar(){
        Car maxPowerCar = cars[0];
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPower() > maxPowerCar.getPower()) {
                maxPowerCar = cars[i];
            }
        }
        return maxPowerCar;
    }
}
