package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Credit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
//String input="4123456789123456 3423";
       String visaregex="^4+[0-9]{15}$";
       String masterCardRegex="^5+[0-9]{15}$";

       if(Pattern.matches(visaregex,input)){
           System.out.println("valid visa");
       }else if(Pattern.matches(masterCardRegex,input)) {
           System.out.println("valid master");
       }else{
           System.out.println("not valid");
       }

    }
}
