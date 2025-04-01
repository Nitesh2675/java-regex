package com.bridgelabz.regex;

public class BadWords {
    public static void main(String[] args){
        String input="This is a damn bad example with some stupid words.";
        String[] bad={"damn","stupid"};
        for(String bw:bad){
            String regex= "\\b" + bw + "\\b";
           input= input.replaceAll(bw,"****");
        }
        System.out.println(input);


    }
}
