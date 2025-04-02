package com.bridgelabz.regex;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programming {
    public static void main(String[] args) {
        String input="I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String[] languages = { "Java", "Python", "C++", "JavaScript", "Ruby", "Swift", "Go", "Kotlin", "Rust", "PHP" };

        String regex = "\\b(" + String.join("|", languages) + ")\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Use a Set to avoid duplicates
       List<String> foundLanguages=new ArrayList<>();

        while (matcher.find()) {
            foundLanguages.add(matcher.group());
        }

        // Print unique programming languages
        System.out.println(String.join(", ", foundLanguages));





       /*
        Pattern pattern;
        Matcher matcher;
        for(String i:languages){
            pattern=Pattern.compile(i);
            matcher=pattern.matcher(input);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        } */
    }
}
