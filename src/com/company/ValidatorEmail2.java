package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorEmail2 implements Validator {
    /**
     * @param str - this string which we are to check for valid;
     * @return true - valid string, false - non-valid string;
     */
    @Override
    public boolean validate(String str) {
        Pattern email = Pattern.compile("\\w+[.]*\\w+@(yandex|gmail|mail).(ru|by|ua)");
        Matcher checkDate = email.matcher(str);
        return checkDate.matches();
    }
}
