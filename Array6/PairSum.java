
//Find the total number of pairs in the array whose sum is equal to the given value x
package Array6;

import java.util.Scanner;

public class PairSum {

    static int  pairSum (int[] arr, int target){
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n ; i++){//first number
            for(int j = i + 1;j < n; j++){//second number
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " +n+ " elements : ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();

    }
        System.out.print("ENter target sum : ");
        int target = sc.nextInt();

        System.out.println(pairSum(arr, target));
}
}