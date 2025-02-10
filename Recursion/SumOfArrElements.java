//Find the sum of the elements of the array [2 ,3 ,5 ,20 ,1]
package Recursion;

public class SumOfArrElements {
    static int sumOfArray(int[] arr , int idx){
        //base case
        if(idx == arr.length) {
            return 0;
        }

        //recursive work - subProblem
        int smallAns = sumOfArray(arr, idx+1);

        //self work
        return smallAns + arr[idx];
    }

    public static void main(String[] args){
        int [] arr = {5 ,16 ,17 ,8 ,9};
        //int [] arr = {}; //0
        System.out.println(sumOfArray(arr,0));

    }
}

//TC = O(n)
//SC= O(n)
