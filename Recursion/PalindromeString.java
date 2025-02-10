//Write a program to check given string is palindrome aor not
package Recursion;

import java.util.Scanner;

public class PalindromeString {
    static String reverse(String s , int idx){
        if (idx == s.length()) return "";
        String smallAns = reverse(s, idx+1);
        return smallAns + s.charAt(idx);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = reverse(s,0);
        if (rev.equals(s)){
          //  System.out.println("palindrome");
            System.out.printf("%s is palindrome" , s);
        } else {
            //System.out.println("not palindrome");
            System.out.printf("%s is not palindrome", s);
        }
    }
}
