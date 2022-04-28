package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidator implements Validator {
    /**
     * @param str - this string which we are to check for valid;
     * @return true - valid string, false - non-valid string;
     */
    @Override
    public void validate(String str) {
        Pattern IP = Pattern.compile("([A-z0-9]{2,4}\\.){3}[A-z0-9]{2,4}");
        Matcher checkIP = IP.matcher(str);
        if (!checkIP.matches()) {
            throw new EmailValidator.IncorrectInputException("Incorrect input");
        }
    }
}
