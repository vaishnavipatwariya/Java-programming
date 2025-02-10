/*
Wrapper Classes :
A class whose object contains or wraps PDT(Primitive Data Type).
Object of a wrapper class contains a field which stores PDT.
PDT - Wrapping Class
int - Integer
float - Float
char - Character
boolean - Boolean
long - Long
 */

/*
ArrayList Class
Syntax to create ArrayList
List<AnyClass> list = new ArrayList<AnyClass>();
 */
package ArrayList;

import com.sun.jdi.Value;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Wrapper classes
       Integer i = Integer.valueOf(4);
        System.out.println(i);
       Float f =  Float.valueOf(4.5f);
        System.out.println(f);
        Character ch = Character.valueOf('@');
        System.out.println(ch);

        ArrayList<Integer>  l1 = new ArrayList<>();
        // ArrayList<Boolean>  l2 = new ArrayList<>();
        // ArrayList<Character> l3 = new ArrayList<>();



        //add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get an element ai index i
        System.out.println(l1.get(1)); //6

        //print with for loop
        for(int j = 0; j < l1.size(); j++){
            System.out.print(l1.get(j)+ " "); // 5, 6 ,7 8
       }
        System.out.println();

        //printing the array list directly
        System.out.println(l1); //[5 ,6 ,7 ,8]


        //adding element at some index i
        l1.add(1 ,100) ; //[5 , 100 , 6 , 7 ,8]
        System.out.println(l1);


        //modifying element at index i
        l1.set(1 , 10);
        System.out.println(l1);//[5 ,10 , 6 , 7 , 8]


        //removing an elements at index i
        l1.remove(1);
        System.out.println(l1);//5 ,6 ,7 ,8


        //removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);//5 , 6 ,8

        l1.remove(Integer.valueOf(17));
        System.out.println(l1);// 5 ,6 ,8

       // System.out.println(l1.remove(Integer.valueOf(17)));//false
       // System.out.println(l1.remove(Integer.valueOf(6)));//true

        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);//ture

        boolean ans2 = l1.contains(Integer.valueOf(60));
        System.out.println(ans2);//false

        //if you don't specify class , you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("pfdsd");
        l.add(1);
        l.add(true);
        System.out.println(l);


    }
}
