package Recursion;

//public class Fibonacci {
//    static int fib(int n){
//        //base case
//        if(n==0 || n==1){
//            return n;
//        }
//        //subproblem -> recursive work
//        int prev = fib(n-1);
//        int prevprev = fib(n-2);
//
//        //self work
//        return prev + prevprev;
//    }
//    public static void main(String[] args){
//        for (int i = 0 ; i <= 10 ; i++){
//            System.out.println(fib(i));
//        }
//       // System.out.println(fib(6));
//    }
//}
public class Fibonacci {
    static int fib(int n){
        //base case
        if(n==0 || n==1) return n;

        return fib(n-1) + fib(n-2);

    }
    public static void main(String[] args){

         System.out.println(fib(6));
    }
}

// tc = 0(2^n)
// sc = 0(n)