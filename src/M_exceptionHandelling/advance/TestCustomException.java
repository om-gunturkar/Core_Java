package M_exceptionHandelling.advance;

public class TestCustomException {

    public static void main(String[] args) {

        ValidateAge g1 = new ValidateAge();

        try {
            g1.validate(3);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }

        System.out.println("Rest of code...");
    }
}
