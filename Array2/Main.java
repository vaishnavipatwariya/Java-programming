package Array2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
//        arr[0] = 5;
//        arr[1] = 6;
//        arr[2] = 7;
//        arr[3] = 8;
//        arr[4] = 9;
        System.out.println("Enter " + n + " elements of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original arr");
        printArray(arr);

        //trying to copy arr to arr_2
        //if you want ki original array me change na aye
        // deep copy dusri memory mil jayegi arr_2 ko heap me
      //  int[] arr_2 = arr.clone();
        //second way
//        int[] arr_2 = Arrays.copyOf(arr,arr.length);
        int[] arr_2 = Arrays.copyOfRange(arr,1,4);
        System.out.println("Copied arr_2");
        printArray(arr_2);

        //changing some values of arr_2
       // arr_2[0] = 0;
        //arr_2[1] = 0;

        System.out.println("Original array after changing arr_2 :");
        printArray(arr);


        System.out.println("Copied array after changing arr_2 : ");
        printArray(arr_2);
    }
}






