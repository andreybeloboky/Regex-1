package com.company;

public class Main {

    public static void main(String[] args) {
        String str = new String("andrei.belooboky@yandex.ru");
        EmailValidator validator = new EmailValidator();
        System.out.println(validator.validate(str));

        String str1 = new String("01.01.2000 04:23");
        DateValidator date = new DateValidator();
        System.out.println(date.validate(str1));

        String str2 = new String("99.88.122.146");
        IPValidator IP = new IPValidator();
        System.out.println(IP.validate(str2));

        String str3 = new String("http://example.com/");
        DomainNameValidator domainName = new DomainNameValidator();
        System.out.println(domainName.validate(str3));

        String str4 = new String("andrei.belooboky@yandex.ru");
        Email2Validator email = new Email2Validator();
        System.out.println(email.validate(str4));
    }
}
