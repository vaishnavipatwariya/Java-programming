
//SC = O(1)
//TC = best case -> O(n)
//TC = worst case -> O(n^2)
//TC = avg case -> O(n^2)
//Stable
//InPlace


package Sorting;

public class OptimizeBubbleSorting {

    static void bubbleSorting(int[] a){
        int n = a.length;

        for (int i = 0 ; i < n-1 ; i++) {
            boolean flag = false; // has any swapping happened
            for (int j = 0; j < n-i-1; j++) {

                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true; // some swaps has happened
                }
            }

            if (flag == false){//have any swap happened
                return;
                }
            }
        }


    public static void main(String[] args){
        int[] a = {3 , 4 , 5 , 8,  9 ,7};
        bubbleSorting(a);
         for (int i : a ) {
             System.out.print(i+ " ");
         }
    }
}
