package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    /**
     * @param str - this string which we are to check for valid;
     * @return true - valid string, false - non-valid string;
     */
    @Override
    public void validate(String str) {
        Pattern email = Pattern.compile("([A-z0-9_-]+\\.)*[A-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}");
        Matcher checkEmail = email.matcher(str);
        if (!checkEmail.matches()) {
            throw new IncorrectInputException("Incorrect input");
        }
    }
    public static class IncorrectInputException extends RuntimeException {
        public IncorrectInputException(String message) {
            super(message);
        }
    }
}
