import TransportRealization.*;

public class Main {
    public static void main(String[] args) {
        StackExample stackExample = new StackExample();
        stackExample.methodA();

        Vehicle bicycle = new Bicycle(1,"Stels");
        bicycle.start();
        bicycle = new Car(60, "audi");
        bicycle.start();
        System.out.println(bicycle);

        Vehicle[] vehicles = {new Car(56,"VAZ"),new Bicycle(12,"jui"),new Airplane(120, "Boeing")};
        vehicles[0].start();
        vehicles[1].start();
        System.out.println(vehicles[2].getModel());

        Airplane airplane = new Airplane(240, "Boeing");
        airplane.land();
    }
}