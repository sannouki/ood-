package UserRegistration;

public interface Validator {
    void setNextValidator(Validator nextValidator);
    void validate(UserRegistration user) throws Exception;
}