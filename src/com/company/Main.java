package com.company;

public class Main {

    public static void main(String[] args) {
        String str = new String("andrei.belooboky@yandex.ru");
        EmailValidator validator = new EmailValidator();
        validator.validate(str);

        String str1 = new String("01.01.2000 04:23 vzx 10.12.2000 22:13");
        DateValidator date = new DateValidator();
        date.validate(str1);

        String str2 = new String("99.88.122.146");
        IPValidator IP = new IPValidator();
        IP.validate(str2);

        String str3 = new String("http://example.com/");
        DomainNameValidator domainName = new DomainNameValidator();
        domainName.validate(str3);
    }
}
