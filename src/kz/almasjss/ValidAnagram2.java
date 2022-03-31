package kz.almasjss;

import java.util.Arrays;
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//

public class ValidAnagram2 {
    public boolean isAnagram(String s, String t) {
        String s1 = s.replaceAll("\\s","");
        String s2 = t.replaceAll("\\s","");
        boolean status = true;
        if (s1.length()!=s2.length()){
            status=false;
        }else{
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();

            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1,ArrayS2);

        }
        if (status){
        return true;
        }
        else{
            return false;
        }
    }
//Input: s = "anagram", t = "nagaram"
//Output: true

//    Input: s = "rat", t = "car"
//    Output: false

    public static void main(String[] args) {

    }
}