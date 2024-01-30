public class ElonsToyCar {
    private int totalDistance;
    private int batteryPercentage;

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        car.totalDistance = 0;
        car.batteryPercentage = 100;
        return car;
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
    }

    public String distanceDisplay() {
        int distance = this.totalDistance;
        String message = "Driven " + distance + " meters";
        return message;
    }

    public String batteryDisplay() {
        int battery = this.batteryPercentage;
        String message = "";

        if (battery >= 1) {
            message = "Battery at " + battery + "%";
        }
        else {
            message = "Battery empty";
        }
        
        return message;
    }

    public void drive() {
        if (this.batteryPercentage > 0) {
            this.totalDistance += 20;
            this.batteryPercentage -= 1;
            /*if (this.batteryPercentage <= 0) {
                this.batteryPercentage = 0;
                batteryDisplay();
                distanceDisplay();
            }*/
        }
        else {
            batteryDisplay();
            distanceDisplay();
        }
    }
}
