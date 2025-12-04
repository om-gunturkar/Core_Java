package H_Oops.Coupling;

public class Travel {

    private Car car = new Car(); // Tight H_Oops.Coupling

    public void startJourney() {
        car.move();
    }
}
