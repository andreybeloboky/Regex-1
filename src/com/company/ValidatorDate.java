package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorDate implements Validator {
    /**
     * @param str - this string which we are to check for valid;
     * @return true - valid string, false - non-valid string;
     */
    @Override
    public boolean validate(String str) {
        Pattern date = Pattern.compile("(^\\d{2}\\.\\d{2}\\.\\d{2,4} \\d{2}:\\d{2})|(^\\d{2}\\.\\d{2}\\.\\d{2,4})|(\\d{2}:\\d{2})");
        Matcher checkDate = date.matcher(str);
        return checkDate.matches();
    }
}
