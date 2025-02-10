
package Recursion;
import java.util.Scanner;
public class PrintSSQ2 {

    static void printSSQ(String s , String currAns){//s = "abc" , currAns = ""
        if (s.length() == 0){
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0);//a
        String remString = s.substring(1); //bc

        //cur char -> choose to be a part of currAns
        printSSQ(remString , currAns+curr); // bc ,a // add curr

        //curr char -> does not choose to be a part of currAns
        printSSQ(remString,currAns);//bc ," " //do not add curr
    }
    public static void main(String[] args){
        printSSQ("abc" , "");

    }
}
