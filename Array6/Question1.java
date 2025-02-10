//Find the last occurrence of an element x in a given array.
package Array6;

import java.util.Scanner;

public class Question1 {

    static int lastOccurrence(int[] arr, int x ){
     int lastIndex = -1;
     for (int i = 0; i < arr.length; i++){
         if (arr[i] == x){
             lastIndex = i;
         }
        }
     return lastIndex;
    }
    static int countOfOccurrences(int[] arr, int x){
        int count = 0;
        for(int i = 0 ; i < arr.length; i++){
            if (arr[i] == x){
                count++;
            }
        }
        return count;
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

        System.out.println("Enter x :");
        int x = sc.nextInt();
        //System.out.println("COUNT OF X:" + countOfOccurrences(arr,x));

        System.out.println("LAST OCCURRENCE OF X : " +lastOccurrence(arr,x)) ;
    }
}


