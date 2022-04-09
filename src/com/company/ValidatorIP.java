package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorIP implements Validator {
    /**
     * @param str - this string which we are to check for valid;
     * @return true - valid string, false - non-valid string;
     */
    @Override
    public boolean validate(String str) {
        Pattern IP = Pattern.compile("([A-z0-9]{2,4}\\.){3}[A-z0-9]{2,4}");
        Matcher checkIP = IP.matcher(str);
        return checkIP.matches();
    }
}
