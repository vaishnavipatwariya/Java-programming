/*
Give an array of names of the fruits; you are supposed to sort it in lexicographical order
using the selection sort

Input : ["papaya","lime","watermelon","apple","mango","kiwi"]
Output : ["apple","kiwi","lime","mango","papaya","watermelon"]

input : cottage , cot , college
Output : college , cot , cottage

1 , 20 , 2 ,10 , 200 ,100
1 ,10 , 100 , 2, 20 ,200
 */
package Sorting;

public class LexicoGraphicalOrderSS {
    static void sortFruits(String[] fruits){
        int n = fruits.length;
        for (int i = 0 ; i < n-1 ; i++){
            int min_index = i;
            for (int j = i+1 ; j < n ; j++){
                if (fruits[j].compareTo(fruits[min_index]) < 0){
                    min_index = j;
                }
            }
            //swap fruits[min_index],fruits[i]
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }
    }
    public static void main(String[] args){
        String[] fruits = {"kiwi" , "apple" , "papaya" , "mango"};
        sortFruits(fruits);
        for (String val : fruits){
            System.out.print(val+ " ");
        }
    }

}
