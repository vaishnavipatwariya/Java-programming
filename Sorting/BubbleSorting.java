/*
1 -> We do a certain no. of passes and in every pass,
we compare adjacent elements and swap them if they are not in correct order.

2 -> In every iteration , the largest no. in part of array to be processed
gets its correct position .

 */


package Sorting;

public class BubbleSorting {
    static void bubbleSort(int[] a){
        int n = a.length;
        //n - 1 iterations/passes
        for (int i = 0; i < n-1 ; i++){
            for (int j = 0 ; j < n-i-1 ; j++){
                /*
                last i elements are already at correct sorted positions,
                so np need to check them
                 */
                if (a[j] > a[j+1]){
                    //swap -> a[j] , a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] a = { 7 ,6 , 5 , 4 , 3};
        bubbleSort(a);
        for (int i : a){
            System.out.print(i+ " ");
        }
    }
}

/*
TC= bubble, selection , insertion -> O(n^2)
    quick , merge                 -> O(nlogn)
 */