package UserRegistration;

//validation for phone number
public class PhoneNumberValidator implements Validator {
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
        String phoneNumber = user.getPhoneNumber();
        //make sure phone number is exactly 10 digits long
        if (phoneNumber != null && (!phoneNumber.matches("\\d{10}"))) {
            throw new Exception("Phone number must be 10 digits long.");
        }
        //if next validator is not null, call next validator
        if (nextValidator != null) {
            nextValidator.validate(user);
        }
    }
}