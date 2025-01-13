package UserRegistration;
//validation for email
public class EmailValidator implements Validator {
    // Reference to the next validator in the chain.
    private Validator nextValidator;

    // Set the next validator in the chain.
    @Override
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    //perform validation
    @Override
    public void validate(UserRegistration user) throws Exception {
        String email = user.getEmail();
        //make sure email contain special character
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new Exception("Invalid email format.");
        }
        //if next validator is not null, call next validator
        if (nextValidator != null) {
            nextValidator.validate(user);
        }
    }
}