//Given an array of n integers ans a target value x . Print whether x exists in the array or not
//Constraints : 0<=n<=10^6 ,-10^8<=x<=10^8 , -10^8<=a[i]<=10^8
//Input1 = n=8 , x=14 , array = [4,12,54,14,3,8,6,1]
//Output : yes
package Recursion;

public class Search {
    static boolean search(int[] a , int n , int target , int idx){
        //base case
        if (idx >= n) return false;

        //recursive work
        if (a[idx]==target) return true;

        //self work
        return search(a,n,target,idx+1);

    }
    public static void main(String[] args){
        int[] a = {1 ,2 ,4, 6};
        int target = 4;
        if(search(a,a.length,target,0)){
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
    }
}
