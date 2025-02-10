package Recursion;

import java.util.Scanner;

public class BasicsOfStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        //String s = "College"

        //arr = {1,2,3} , arr[0]
        /*
        college
        0123456
        n = 7
         */
        char ch = s.charAt(0);
        System.out.println(ch);

        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }

        System.out.println(s.substring(2,6));//2,3,4,5
        System.out.println(s.substring(1));
        System.out.println(s.substring(4));
        System.out.println(s.substring(7));
        System.out.println(s.substring(14));
        System.out.println(s.substring(4,9));//4,5,6,7,8

    }
}
