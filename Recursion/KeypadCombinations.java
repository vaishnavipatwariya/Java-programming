/*
Given a string containing digits from 2-9 inclusive ,
return all possible letter combinations that the number could represent.
Return the answer in any order

Input = : digits = "23"
Output : ["ad" , "ae" , "af" , "bd" , "be" , "bf" , "cd" , "ce" , "cf"]

2  -> abc , 3 -> def , 4 -> ghi , 5-> jkl , 6 -> mno , 7 -> pqrs , 8 -> tuv , 9 -> wxyz

 */
package Recursion;

public class KeypadCombinations {
    static void combination(String dig ,  String[] kp, String res){//"253" -> kp[2]
     if (dig.length() == 0){
         System.out.print(res + " ");
         return;
     }
       int currNum = dig.charAt(0) - '0';//2
        String currChoices = kp[currNum]; //"abc"

        for (int i = 0; i < currChoices.length() ; i++){//"abc"
            combination(dig.substring(1),kp ,res+currChoices.charAt(i));
        }
    }

    public static void main(String[] args){
        String dig  = "253";
        //kp[7] = "pqrs"
        String[] kp = {"" ,  " " , "abc" , "def" , "ghi" , "jkl" ,"mno" , "pqrs" , "tuv" , "wxyz"};
        //              0     1      2       3       4       5      6        7        8       9
    combination(dig , kp,  "");
    }
}
//TC=O(n4^2)
