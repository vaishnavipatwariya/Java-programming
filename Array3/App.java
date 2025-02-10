package Array3;

public class App {
    static void changeArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = 0;
        }
    }

    static void changeVal(int a){
        a =1104;
    }

    public static void main(String[] args){
        int a = 5;
        changeVal(a);
        System.out.println(a);
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;

        changeArray(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
