package com.bridgelabz.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Currency {
    public static void main(String[] args) {
        String input="The price is $45.99, and the discount is 10.50.";
        String regex="\\$*[0-9]+.[0-9]{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);

        List<String> foundValues=new ArrayList<>();

        while(matcher.find()){
            foundValues.add(matcher.group());
        }
        System.out.println(String.join(",",foundValues));
    }
}
