package TransportRealization;

public class Bicycle extends Vehicle {
    public Bicycle(int speed, String model){
        super(speed, model);
    }

    @Override
    public void start(){
        System.out.printf("TransportRealization.Bicycle model is %s%n",getModel());
    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "is bicycle";
    }
}
