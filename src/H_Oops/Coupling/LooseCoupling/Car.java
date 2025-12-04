package H_Oops.Coupling.LooseCoupling;

public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("Car is moving...");
    }
}
