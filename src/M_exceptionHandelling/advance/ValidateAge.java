package M_exceptionHandelling.advance;

public class ValidateAge {

    void validate(int age) throws InvalidAgeException {

        if (age < 20) {
            throw new InvalidAgeException("Invalid age!!! Age must be 20 or above.");
        } else {
            System.out.println("Valid age!");
        }
    }
}
