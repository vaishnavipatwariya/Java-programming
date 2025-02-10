//Given 2 integers a and b . Swap the 2 given values using sum and difference method
package Array6;

public class SwapSecondMethod {
    static void swapWithoutTemp(int a, int b) {
        System.out.println("Original values before swap ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values after swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
     public static void main(String[] args){
        int a = 9;
        int b = 3;
        swapWithoutTemp(a,b);
     }
    }

