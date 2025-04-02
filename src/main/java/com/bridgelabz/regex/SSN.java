package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSN {
    public static void main(String[] args) {
       String input= "My SSN is 123-45-6789.";
       String regex="[0-9]{3}-[0-9]{2}-[0-9]{4}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
