package com.bridgelabz.regex;

public class ReplaceSpace {
    public static void main(String[] args){
      String input= "This is    an   example with multiple spaces.";
        String output=input.replaceAll("\\s+"," ");
        System.out.println(output);
    }
}
