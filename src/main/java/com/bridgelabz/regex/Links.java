package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Links {
    public static void main(String[] args){
        String input="Visit https://www.google.com and http://example.org for more info.";
        String regex= "https*://[a-z.]*[a-z]+";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        while(matcher.find()){
            System.out.println("Matches: "+matcher.group());
        }
    }
}
