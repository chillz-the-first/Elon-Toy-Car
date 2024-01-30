public class Main {
    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        // car.drive();
        // car.drive();
        for (int i = 0; i < 23; i++) {
            car.drive();
        }
        
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        // car.drive();
    }
}
