//Given a square matrix , turn it by 90 degrees in a clockwise direction
//without using any extra space.

// 2 3 4     9 6 2
// 6 7 8     2 7 3
// 9 2 1     1 8 4

package TwoDArrays;
import java.util.Scanner;
public class RotateMatrix {

    static void printMatrix(int[][] matrix){
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void transposeInPlace(int[][] matrix, int r , int c){
        for (int i = 0; i <  c; i++){
            for (int j = i ; j < r; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
    static void reverseArray(int[] arr){
        int i = 0 , j = arr.length-1;

        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

    }

    static void rotate(int[][] matrix , int n){
        // transpose
        transposeInPlace(matrix, n ,n);

        //reverse each row of transposed matrix
        for (int i = 0 ; i < n; i++){
        /*
        1 , 2 , 3
        4 , 5 , 6
        7 , 8 , 9

        i = 0
        reverseArray({1,2,3})
        */
            reverseArray(matrix[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter equal number of rows and columns of matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " values : ");
        for (int i = 0 ; i < r ; i++){
            for (int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matirx : ");
        printMatrix(matrix);

        rotate(matrix , r);

        System.out.println("Rotation of matrix : ");
        printMatrix(matrix);
    }
}
