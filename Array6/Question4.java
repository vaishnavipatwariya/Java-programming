//Check if the given array is sorted or not.
//increasing order
package Array6;

import java.util.Scanner;

public class Question4 {
    static boolean isSorted (int[] arr ){
        boolean check = true;
        for(int i = 1 ; i < arr.length; i++){
//            // i = 0
            // arr[0] = arr[-1]

            if (arr[i] < arr[i-1] ){
                //not sorted
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("Enter x :");
//        int x = sc.nextInt();
        System.out.println("IS SORTED : " +isSorted(arr));
    }
}
