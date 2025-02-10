//Given two numbers p and q , find the value p^q using a recursive function.
// p^q = p * p * p * p ...... * p -> q times
//p^q = p ^ (q-1)  * p

package Recursion;

public class PowerOfNumber {
    static int pow(int p, int q) {// p^q
        if (q == 0) return 1;
        return pow(p, q - 1) * p; // p^q-1 * p = p^q
    }

    public static void main(String[] args) {
        System.out.println(pow(5, 4));
    }
}

