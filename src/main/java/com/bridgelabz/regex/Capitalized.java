package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Capitalized {
    public static void main(String[] args){
       String input= "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
       String regex="[A-Z]+[a-z]*";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        while(matcher.find()){
            System.out.println("Matches: "+matcher.group());
        }
    }
}
