package com.company;

public class Main {

    public static void main(String[] args) {
        String str = new String("andrei.belooboky@yandex.ru");
        ValidatorEmail validator = new ValidatorEmail();
        System.out.println(validator.validate(str));

        String str1 = new String("01.01.2000 04:23");
        ValidatorDate date = new ValidatorDate();
        System.out.println(date.validate(str1));

        String str2 = new String("99.88.122.146");
        ValidatorIP IP = new ValidatorIP();
        System.out.println(IP.validate(str2));

        String str3 = new String("http://example.com/");
        ValidatorDomainName domainName = new ValidatorDomainName();
        System.out.println(domainName.validate(str3));

        String str4 = new String("andrei.belooboky@yandex.ru");
        ValidatorEmail2 email = new ValidatorEmail2();
        System.out.println(email.validate(str4));
    }
}
