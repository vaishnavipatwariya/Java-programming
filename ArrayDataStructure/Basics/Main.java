//What is array -> Collection of similar type of data or homogenous items
//indexing -> 0 based
//Memory allocation -> contiguous

//Representation of array
//int[] array_name;
//int[] ages;
//String[] names;
//float[] weight;

//Syntax for Array Declaration
// int[] array name = new int [size];
// 0r// float weight [] = new  float[10];

//2nd way
//Array Literal
//int[] array_name = {1,2,3,4,5,6,
package ArrayDataStructure.Basics;

class ArraysExample{

    void sumOfArray(){
        int[] arr = {1,4,5,6,1};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    void multiArrays(){
        int[][] arr = {{56, 43, 6} , {34, 7, 8}};

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(arr[i][j]);
            }
        }

        //or
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

//         3d array
//        int[][][] arr_3 = new int[5][3][2];// 5 * 3 * 2 = 30
//        arr_3[0][0][0] = 1;
        System.out.println();

        System.out.println(arr[0][0]); //56
        System.out.println(arr[0][1]); //43
        System.out.println(arr[0][2]); //6

        System.out.println(arr[1][0]); //34
        System.out.println(arr[1][1]); //7
        System.out.println(arr[1][2]); //8

    }

    void DemoArrays(){
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = {"Rahul", "Raj" , "Ram" , "gita"};

        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 6;

        //Traversing through the Array
        //for loop
        //for each loop
        //while loop

        //for loop
        for(int i = 0; i < 3; i++){
            //or //for(int i = 0; i < ages.lenght; i++){
            System.out.println(ages[i]); // 34   12   6
        }

        //for each loop
        //humare pass jo ages array he  har ek element ko age me hum store kr rahe or age ko print kr rahe
        //ek iski limitation he hum  pura array hi print karwa sakte humari marji ke hissab se nhi print krwa sakte jese hame irf 3 elements tak print krwana toh vo nhi ho sakta yaha
        for(int age : ages){
            System.out.println(age);//34  12  6
        }

        //while loop
        int i = 0;
        //while(i < 3){
        //or
        while(i < ages.length){
            System.out.println(ages[i]);//34   12  6
            i++;
        }


        System.out.println(ages.length);//3
        System.out.println(weights.length);//3
        System.out.println(names.length);//4

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

    }
}

public class Main {
    public static void main(String[] args) {
      ArraysExample obj = new ArraysExample();
        obj.DemoArrays();
        obj.multiArrays();
        obj.sumOfArray();
    }
}
