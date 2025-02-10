//Given two numbers p & q , Find the value p^q using a recursive function
package Recursion;

public class Power {
//    static int pow(int p ,int q){ // p^q
//        //base work
//        if(q == 0) return 1;
//        //recursive and self work
//        return pow(p , q-1) * p; // p^q-1 * p = p^q
//
//        //TC = O(q)
//        //SC = O(q)
//    }


    //better approach
    static int pow(int p ,int q){ // p^q
        //base work
        if(q == 0) return 1;
        int smallPow = pow(p,q/2);
        if(q % 2 == 0){//even
            return smallPow * smallPow;
            // return pow(p,q/2) * (p,q/2) don't do nhi toh TC increase ho jaye gi
        }
        return p * smallPow * smallPow;//odd
        //TC = O( log q)

    }

    public static void main(String[] args){
        System.out.println(pow(5,4));
    }
}
