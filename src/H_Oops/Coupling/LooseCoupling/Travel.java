package H_Oops.Coupling.LooseCoupling;

public class Travel {

    private Vehicle vehicle;   // Loose H_Oops.Coupling (reference of interface)

    // Constructor Dependency Injection
    public Travel(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startJourney() {
        vehicle.move();
    }
}
