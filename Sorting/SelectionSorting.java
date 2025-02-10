/*
SC = O(1)
TC= O(n^2)
Not stable
InPlace algorithm
 */

package Sorting;
public class SelectionSorting {
    static void selectionSort(int[] arr){
       int n = arr.length;

       for (int i = 0 ; i < n-1 ; i++){//i represent the current index

           //Find the minimum element in unsorted array
           int min_index = i;
           for (int j = i+1 ; j<n ; j++){
               if (arr[j] < arr[min_index]){
                   min_index = j;
               }
           }
           //swap current  element and minimum element -> current index i will have correct element
           // a[min_index] , a[i]
           int temp = arr[i];
           arr[i] = arr[min_index];
           arr[min_index] = temp;
       }
    }
    public static void main(String[] args){
        int[] arr = {7,4,5,1,2};
        selectionSort(arr);
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
