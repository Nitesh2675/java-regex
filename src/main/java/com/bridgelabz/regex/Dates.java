package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dates {
    public static void main(String[] args){
        String input="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        String regex= "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        while(matcher.find()){
            System.out.println("Matches: "+matcher.group());
        }

    }
}
