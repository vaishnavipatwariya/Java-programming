// Given an array arr of size N and an integer X . The task is to find all the indices of the integer  X in the array
//Input : arr={1,2,3,2,2,5} , X = 2
//Output : 1 3 4

package Recursion;

public class PrintAllIndices {
    static void findAllIndices(int[] a, int n , int target , int idx){// 1,2,3,2,2,5
        //base case
        if (idx >= n){
            return;
        }
        //self work
        if (a[idx] == target){
            System.out.println(idx);
        }
        //recursive work
        findAllIndices(a, n, target,idx+1);//1,3,4

    }
    public static void main(String[] args){
        int[] a = {1,2,3,2,2,5};
        int target = 2;
        int n = a.length;
        findAllIndices(a,n,target,0);

    }

}
