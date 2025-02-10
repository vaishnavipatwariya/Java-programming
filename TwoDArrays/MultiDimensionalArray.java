package TwoDArrays;
import java.util.Scanner;
public class MultiDimensionalArray {

        static void printArray(int[][] arr){
            for (int i = 0; i < arr.length; i++){//row
               // System.out.println(arr[i]);
                for (int j = 0; j < arr[i].length ; j++){//column
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // int[][] arr = new int[2][3];
        int[][] arr2 = {{1 , 5 , 6},{7 , 9 , 11},{8 , 1 ,1}};
        printArray(arr2);

    }
}
