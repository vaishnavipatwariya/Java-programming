/*
Given an integer array arr , move all 0's to the end of it while maintaining
the relative order of the non-Zero elements.

Note that you must do this without making a copy of the array.

Input: 0 5 0 3 4 2
Output: 5 3 4 2 0 0
 */
package Sorting;

public class Problem1Move0BS {
    public static void main(String[] args){
        int[] arr = {0 , 1 , 10 , 5 , 0 , 4};
        int n = arr.length;
        for (int i = 0 ; i < n-1 ; i++){
            for (int j = 0 ; j < n-i-1 ; j++){
                if (arr[j] == 0 && arr[j+1] != 0){
                    //swap arr[j] , arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int val : arr){
            System.out.print(val+ " ");
        }
    }
}
