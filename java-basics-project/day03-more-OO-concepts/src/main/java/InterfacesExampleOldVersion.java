public class InterfacesExampleOldVersion {
    public static void main(String[] args) {
        Vehicle tesla = new Car();
        tesla.start();
        tesla.stop();
    }
}
//1. Pure abstract class with only abstract methods
interface Vehicle {
    void start();
    void stop();
}
interface EV {}
//class Car : Vehicle {..}
class Car implements Vehicle, EV {

    //public void start() implements Vehicle.start {..}
    public void start() {
    }

    public void stop() {
    }
}