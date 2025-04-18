//Given Q queries , check if the given number is present in the array or not.
// Note : Value of all the elements in the array is less than 10 to the power 5.

package Array6;
import java.util.Scanner;

public class PresentQuery {

    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];

        for (int i = 0; i < arr.length; i++ ){
            freq[arr[i]]++;
        }
        return freq;
    }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter " + n + "elements : ");
    for (int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }

    int[] freq = makeFrequencyArray(arr);

    System.out.print("Enter number of queries ");
    int q = sc.nextInt();

    while (q > 0){
        System.out.println("Enter number to be searched ");
        int x  = sc.nextInt();
        if (freq[x] > 0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        q--;
      }
    }
}
