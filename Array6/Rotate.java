//Rotate the given array 'a' by k steps, where k is non-negative.
//note -> k can be greater than n as well.
// arr = 1 ,2 ,3 ,4 ,5      arr 1,2,3,4,5,6,7
// k = 1  5, 1 ,2 ,3 ,4       k=5  3,4,5,6,7,  1,2
// k = 2  4 ,5 ,1, 2, 3      index n-k to n-1 , 0 to n-k-1
// k = 3  3 ,4 ,5 ,1 ,2        n-1 or i<n bhi likh sakte
//k = 5   1 ,2 ,3 ,4 ,5
// k = 7   4 ,5, 1, 2, 3
package Array6;
import java.util.Scanner;
public class Rotate {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }

    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n-k ; i < n; i++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i < n-k ; i++){
           ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " +n+ " elements : ");
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k : ");
        int k = sc.nextInt();

        System.out.println("Original array ");
        printArray(arr);
        int[] ans = rotate(arr, k);
        System.out.println("Array after rotation ");
        printArray(ans);

    }

}
