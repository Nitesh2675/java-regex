package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPv4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        String regex="^[0-9]{0,3}.[0-9]{0,3}.[0-9]{0,3}.[0-9]{0,3}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("valid");
        }
        else{
            System.out.println("Not valid");
        }
    }
}
