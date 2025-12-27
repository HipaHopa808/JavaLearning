package TransportRealization;

public interface Flyable {
    void fly();
    default void land(){
        System.out.println("Приземляюсь");
    };
}
