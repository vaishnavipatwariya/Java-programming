//Write a program to print reverse of a string using recursion
package Recursion;

import java.util.Scanner;

public class ReverseString {
    static String reverse(String s , int idx){
        if(idx == s.length()) return "";
        String smallAns = reverse(s,idx+1);
        return smallAns + s.charAt(idx);
    }

//    static String reverse2(String s){
//        if (s.length() == 0) return "";
//        String smallAns = reverse(s.substring(1));
//        return smallAns + s.charAt(0);
//    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s,0));

    }
    
}
//tc = O(n^2)
