package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomainNameValidator implements Validator {
    /**
     * @param str - this string which we are to check for valid;
     * @return true - valid string, false - non-valid string;
     */
    @Override
    public void validate(String str) {
        Pattern domainName = Pattern.compile("http://\\w+\\.(com|ru|by|ua)/");
        Matcher checkDate = domainName.matcher(str);
        if (!checkDate.matches()) {
            throw new EmailValidator.IncorrectInputException("Incorrect input");
        }
    }
}
