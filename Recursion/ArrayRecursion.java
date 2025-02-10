//Print the max value of the array

package Recursion;
//import java.util.Scanner;

public class ArrayRecursion {

    static void printArray(int[] arr, int idx){ //5 ,6 ,7 ,8 ,9
        //base case
        if(idx == arr.length){
            return;
        }

        //self work
        System.out.println(arr[idx]);

        //recursive work - sub problem
        printArray(arr, idx+1);
    }

    public static void main(String[] srgs){
        int [] arr = {5 ,6 ,7 ,8 ,9};
        printArray(arr,0);
    }
}

//TC = O(n)
//SC = O(n)