package UserRegistration;
//validate the password
public class PasswordValidator implements Validator {
    private Validator nextValidator;
    //set the next validator
    @Override
    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }
    //perform validation
    @Override
    public void validate(UserRegistration user) throws Exception {
        String password = user.getPassword();
        if (password == null || password.length() < 8 ||
            !password.matches(".*[A-Z].*") || // Check for uppercase letter 
            !password.matches(".*[a-z].*") || // Check for lowercase letter
            !password.matches(".*[0-9].*")) { // Check for digit
            throw new Exception("Password must be at least 8 characters long, contain an uppercase letter, a lowercase letter, and a digit.");
        }
        //if next validator is not null, call next validator
        if (nextValidator != null) {
            nextValidator.validate(user);
        }
    }
}