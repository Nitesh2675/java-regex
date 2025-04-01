package com.bridgelabz.regex;

import java.util.Scanner;

public class ValidateUsername {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input =sc.next();
        String regex= "^[a-zA-Z][a-zA-useZ0-9_]{4,14}$";
        if(input.matches(regex)){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }
    }
}
