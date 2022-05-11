package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator implements Validator {
    /**
     * @param str - this string which we are to check for valid;
     * @return true - valid string, false - non-valid string;
     */
    @Override
    public void validate(String str) {
        Pattern date = Pattern.compile("(\\d{2}\\.\\d{2}\\.\\d{2,4} \\d{2}:\\d{2})|(\\d{2}:\\d{2})");
        Matcher checkDate = date.matcher(str);
        while (checkDate.find()) {
            System.out.println(checkDate.groupCount());
            System.out.println(checkDate.group());
        }
        if (!checkDate.matches()) {
            throw new IncorrectException("Incorrect input");
        }
    }
}
