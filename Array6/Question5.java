package Array6;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    static int[] smallestAndLargestElement(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0] , arr[arr.length-1]};
        return ans;
//        static void smallestAndLargestElement(int[] arr){
//            Arrays.sort(arr);
//            for (int i = 0; i < arr.length; i++){
//                System.out.print(arr[i] +" ");
//            }
        }



        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array :");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

               int[] ans =  smallestAndLargestElement(arr);
                System.out.println("Smallest : " +ans[0]);
                System.out.println("Largest : " +ans[1]);
          //  smallestAndLargestElement(arr);
            }
        }

