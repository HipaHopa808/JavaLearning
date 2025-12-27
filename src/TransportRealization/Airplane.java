package TransportRealization;

public class Airplane extends Vehicle implements Flyable{


    public Airplane(int speed, String model) {
        super(speed, model);
    }

    @Override
    public void start() {
        System.out.println("Самолет стартует");
    }

    @Override
    public void move() {

    }




    @Override
    public void fly() {
        System.out.printf("Самолет %s летит%n", getModel());
    }

}
