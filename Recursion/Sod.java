//Given an integer , find out the sum of its digits using recursion
// n = 1234 f(n) = 10
package Recursion;

public class Sod {
    static int sumOfDigit(int n){
        //base case
        if(n >= 0 && n <= 9) return n;
        //recursive and self worf
        return sumOfDigit(n/10) + n%10;
    }
    public static void main(String[] args){
        System.out.println(sumOfDigit(5462));
    }
}
