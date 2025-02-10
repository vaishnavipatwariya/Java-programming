//Given an array 'a' consisting of integers. Return the first value that is repeating in this array. If no value is being repeated , return -1.

package Array6;

import java.util.Scanner;

public class RepeatingNumber {

    static int firstRepeatingNumber(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {//first number
            for (int j = i + 1; j < n; j++) {//second number
                if (arr[i] == arr[j]) {//found answer
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println("First max : " +findMax(arr) );
        // System.out.println( "Second max : "+findSecondMax(arr));
        System.out.println("First Repeating Number : " + firstRepeatingNumber(arr));
    }
}






