package wcs.specialisation.passwordValidator;

public class PasswordValidator {

    public boolean isLengthValid(String password) {
        return password.length() >= 8;
    }

    public boolean containsSpecialCharacter(String password) {
        return password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
    }

    public boolean containsDigit(String password) {
        return password.matches(".*\\d.*");
    }

    public boolean containsLetter(String password) {
        return password.matches(".*[a-zA-Z].*");
    }
}
