package UserRegistration;

//validation for username
public class UsernameValidator implements Validator {
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
        String username = user.getUsername();
        //make sure username is at least 5 characters long
        if (username == null || username.length() < 5) {
            throw new Exception("Username must be at least 5 characters long.");
        }
        //if next validator is not null, call next validator
        if (nextValidator != null) {
            nextValidator.validate(user);
        }
    }
}