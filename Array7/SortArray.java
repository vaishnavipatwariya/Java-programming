//sort an array consisting of only 0s and 1s

package Array7;
import java.util.Scanner;
public class SortArray {

    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int zeroes = 0;

        //count number of zeroes
        for (int i = 0; i < n; i++){
            if (arr[i] == 0){
                zeroes++;
            }
        }
        //0 to zeroes-1 : 0 , zeroes to n-1 : 1
        for (int i = 0; i < n; i++){
            if (i < zeroes){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array : ");
        printArray(arr);
        sortZeroesAndOnes(arr);
        System.out.println("Sorted array : ");
        printArray(arr);


    }
}

