package com.bridgelabz.regex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Repeating {
    public static void main(String[] args) {

        String sentence="This is is a repeated repeated word test.";
        System.out.println(findRepeat(sentence));
    }

    public static Set<String> findRepeat(String sentence){
        String[] words=sentence.toLowerCase().split("\\s+");
        HashMap <String,Integer> wordcount=new HashMap<>();
        for(String word:words){
            word=word.replaceAll("[^a-z]","");
            if(!word.isEmpty()){
                wordcount.put(word, wordcount.getOrDefault(word,0)+1);
            }
        }
        HashSet <String> set=new HashSet<>();
        for(Map.Entry<String,Integer> entry:wordcount.entrySet()){
            if(entry.getValue()>1){
                set.add(entry.getKey());
            }
        }

return set;

    }
}

