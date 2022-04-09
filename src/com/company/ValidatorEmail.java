package com.company;

public class ValidatorEmail implements Validator {

    private boolean CHECK_NAME = false;
    private boolean CHECK_DOMAIN_NAME = false;
    private boolean CHECK_CODE_OF_THE_COUNTRY = false;
    private int start = 0;
    private int begin = 0;

    /**
     * @param str - this string which we are to check for valid;
     * @return true - valid string, false - non-valid string;
     */
    @Override
    public boolean validate(String str) {
        char[] stringToChar = str.toCharArray();
        checkName(stringToChar);
        checkDomainName(str, stringToChar);
        codeOfTheCountry(str, stringToChar);
        return CHECK_NAME && CHECK_DOMAIN_NAME && CHECK_CODE_OF_THE_COUNTRY;
    }

    /**
     * @param stringToChar - the string to massive of char;
     */
    private void checkName(char[] stringToChar) {
        while (stringToChar[start] != '@') {
            if (((stringToChar[start] < 65 || stringToChar[start] > 122) && stringToChar[start] != 46)) {
                break;
            }
            if (start == stringToChar.length - 1 && stringToChar[stringToChar.length - 1] != '@') {
                break;
            }
            start++;
        }
        CHECK_NAME = stringToChar[0] != ' ' && start <= 20;
        begin = start;
    }

    /**
     * @param str          - this string which we are to check for valid;
     * @param stringToChar - the string to massive of char;
     */
    private void checkDomainName(String str, char[] stringToChar) {
        if (begin != stringToChar.length - 1) {
            while (stringToChar[begin] != '.') {
                begin++;
            }
            String str1 = str.substring(start + 1, begin);
            String[] domainName = {"mail", "yandex", "gmail"};
            for (String value : domainName) {
                if (str1.equals(value)) {
                    CHECK_DOMAIN_NAME = true;
                }
            }
            start = begin;
        }
    }

    /**
     * @param str          - this string which we are to check for valid;
     * @param stringToChar - the string to massive of char;
     */
    private void codeOfTheCountry(String str, char[] stringToChar) {
        try {
            while (stringToChar[start] != stringToChar.length) {
                start++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            String str2 = str.substring(begin + 1, start);
            String[] codeOfTheCountry = {"ru", "com", "by"};
            for (String value : codeOfTheCountry) {
                if (str2.equals(value)) {
                    CHECK_CODE_OF_THE_COUNTRY = true;
                }
            }
        }
    }
}
