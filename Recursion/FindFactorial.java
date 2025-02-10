//Find the value of factorial n
package Recursion;
public class FindFactorial {
    static int factorial(int n) {
        //base case
        if (n == 0) return 1;

        //recursive work and self work
        return n * factorial(n - 1);

    }

    public static void main(String[] args) {
        System.out.println(factorial(4));

    }
}

//tc = 0(n)
//sc = 0(n)

//public class FindFactorial {
//    static int factorial(int n){
//        //base case
//        if (n == 0){
//            return 1;
//        }
//
//        //smaller problem -> recursive work
//        int smallAns = factorial(n-1); // factorial(4) = 24
//
//        //big problem -> self work
//        int ans = n * smallAns;  // n * factorial(4)
//        return ans;
//
//    }
//    public static void main(String[] args){
//        System.out.println(factorial(5));
//    }
//}

