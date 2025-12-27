package TransportRealization;

public abstract class Vehicle {
    private int speed;
    private String model;

    public Vehicle(int speed,String model) {
        this.speed = speed;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void start();

    public abstract void move();

    void stop(){
        System.out.println("Транспорт остановлен");
    };

}
