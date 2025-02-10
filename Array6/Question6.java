package Array6;
import java.util.Scanner;
import java.util.Arrays;

public class Question6 {
    static int[] kthSmallestAndLargestElement(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[1], arr[arr.length - 2]};
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of element : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter" + n + " element :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       int[] ans =  kthSmallestAndLargestElement(arr);
        System.out.println("Second smallest element = " + ans[0]);
        System.out.println("Second largest element = "+ans[1]);


    }
}



