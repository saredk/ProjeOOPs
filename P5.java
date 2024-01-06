package ProjectOOPs;

import org.checkerframework.checker.units.qual.A;

import java.util.Arrays;
import java.util.Scanner;

/*
Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams.
 */
public class P5 {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";

        char[] x=str1.toCharArray();
        char[] y=str2.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        Boolean result=Arrays.equals(x,y);
        if(result==true){
            System.out.println("Anagram");

            }else{
            System.out.println("not anagram");
        }
        }


    }
