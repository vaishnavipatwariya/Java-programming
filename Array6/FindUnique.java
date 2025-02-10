//Find the unique number in a given Array where all the elements are being repeated twice with one value being unique.
//only positive elements in array

//1-> Traverse all pairs
//2-> Equal pairs ->mark -1
//Traverse array again , value > 0 is our answer
package Array6;
import java.util.Scanner;
public class FindUnique {
    static int findUnique(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;

                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {//pr if(int[i] !=0)
                ans = arr[i];
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique element : " + findUnique(arr));

      //  System.out.println(Integer.MAX_VALUE);
      //  System.out.println(Integer.MIN_VALUE);
    }
}
