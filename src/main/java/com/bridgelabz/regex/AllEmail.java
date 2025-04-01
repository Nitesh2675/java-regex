package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllEmail {
    public static void main(String[] args) {
        String input = "Contact us at support@example.com and info@company.org, also reach us at test.email@domain.co.uk";


        // Corrected regex pattern for email extraction
        String regex = "[a-z0-9]*@[a-z]+\\.[a-z]{3}";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
//good
        // Find and print all matching email addresses
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}
