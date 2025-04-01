package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.*;

public class HexColor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        String regex= "^#[0-9A-Fa-f]$";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        if(matcher.matches()){
            System.out.println("valid");
        }
        else{
            System.out.println("Not valid");
        }
    }
}
