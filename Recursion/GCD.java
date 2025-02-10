//Given two numbers x and y. Find the GREATEST COMMON DIVISOR(HCF) of x and y using recursion
//constraints : 0 <= x , y <= 10^6
//Input : x = 4 , y = 9
//Output : 1
package Recursion;

import java.util.Scanner;

public class GCD {

    static int gcd(int x , int y){
        if(y == 0){
            return x;
        }
        return gcd(y , x%y); //gcd(x,y) = gcd(y,x)
    }
    static int igcd(int x , int y){
        while (x%y != 0){
            int rem = x % y ;
            x = y;
            y = rem;
        }
        return y;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        //System.out.println(igcd(x,y));
        System.out.println(gcd(x,y));
    }
}

//TC(min(x,y))
//TC = 0(X)