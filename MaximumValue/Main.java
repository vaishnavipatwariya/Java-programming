package MaximumValue;
import java.util.Scanner;
class ArrayExample2{

    void MaxOfArray(){
        int[] arr = {5,3,6,2,8,4};

        int ans = 0;

        for(int i = 0; i <= arr.length -1 ; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println("Max element :"+ans);

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayExample2 obj = new ArrayExample2();
        obj.MaxOfArray();
    }
}
