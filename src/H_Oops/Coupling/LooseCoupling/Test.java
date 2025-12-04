package H_Oops.Coupling.LooseCoupling;

public class Test {

    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        Travel t1 = new Travel(v1);
        t1.startJourney();

        Travel t2 = new Travel(v2);
        t2.startJourney();
    }
}
/*
Output -
Car is moving...
Moving with bike!!!
 */
