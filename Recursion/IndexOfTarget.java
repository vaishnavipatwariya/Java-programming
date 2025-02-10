//Find index first -> Return index of target if target present in array , otherwise return -1

package Recursion;

public class IndexOfTarget {

    static int findIndex(int[] a , int n , int target , int idx){
        // base case
        if (idx >= n) return -1;
        //self work
        if (a[idx] == target) return idx;
        //recursive work
        return findIndex(a,n,target,idx+1);
    }

    public static void main(String[] args){
        int[] a = {1,2,4,4,4,5,6};
        int target = 4;
        int n = a.length;
        System.out.println(findIndex(a,n,4,0));
    }
}
