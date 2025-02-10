/*
Given an array of integers , print sums of all subsets in it.
Output sums can be printed in any order.

Input : arr[] = {2 ,3 ,5}
Output : 0 2 4 5 6 7 9 11
 */

package Recursion;

public class SubsetSum {
    static void subsetSum(int[] a, int n , int idx , int sum){


        if (idx >= n){
            System.out.println(sum);
            return;
        }

        //curr idx + sum
        subsetSum(a , n , idx+1 , sum +a[idx]);//include
        //curr ans\
        subsetSum(a , n ,idx+1 ,sum);//exclude
    }
    public static void main(String[] args){
        int[] a = {2,4,5};
        subsetSum(a,a.length,0,0);
    }
}
