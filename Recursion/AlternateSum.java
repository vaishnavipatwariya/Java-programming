//Given a number n .Fins the sum of natural numbers till n but with alternate signs.
//That means if n = 5 then u have to return 1-2+3-4+5 = 3 as ur answer
package Recursion;
import java.util.Scanner;

public class AlternateSum {
    static int seriesSum2(int n) {
        if(n==0) return 0;

        if(n%2 == 0) {//even
            return seriesSum2(n-1) - n;
        }

        return seriesSum2(n-1) + n; //odd
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSum2(n));
    }
}

//TC = O(n)