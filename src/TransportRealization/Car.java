package TransportRealization;

public class Car extends Vehicle {
    public Car(int speed, String model){
        super(speed, model);
    }

    @Override
    public void start(){
        System.out.printf("TransportRealization.Car started at %d speed%n",getSpeed());
    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "is car";
    }
}
