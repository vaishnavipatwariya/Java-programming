//Remove all the occurrences of 'a' from string s = "abcax"

package Recursion;
import java.util.Scanner;
public class RemoveOccurrences {

    static String removeA2(String s){
        if (s.length() == 0) return "";
        String smallAns = removeA2(s.substring(1));//bcx
        char currChar = s.charAt(0);
        if (currChar != 'a'){
            return currChar+smallAns;//d + bcx
        }else {
            return smallAns;
        }

    }

     // dbacx -> dbcx
    static String removeA(String s , int idx){

        //base case
        if (idx == s.length()) return "";

        //recursive work
        String smallAns = removeA(s,idx+1);//bcx
        char currChar = s.charAt(idx);

        //self work
        if (currChar != 'a'){
            return currChar+smallAns;//d + bcx
        }else {
            return smallAns;
        }
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s,0));
        System.out.println(removeA2(s));
    }
}
