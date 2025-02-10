//Return the count of digits in a given number n
// n = 5672   ans = 4


//CHECK
package Recursion;

public class Count {
    static int countOfDigit(int n){
        if(n >= 0 && n <= 9) return 1;
        return countOfDigit(n/10) + 1;
    }
    public static void main(String[] args){
        System.out.println(countOfDigit(53454478));
    }
}
