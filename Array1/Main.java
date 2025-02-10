//Search the given element x in the array . If present then the index else return -1
package Array1;
class ArrayExample3 {

    void searchArray() {
        int[] arr = {10, 5, 3, 6, 2, 8, 4};
        int x = 2;

        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;

            }
        }
        System.out.println("Found " + x + " at index " + ans);

    }

}
    public class Main {
        public static void main(String[] args) {
            ArrayExample3 obj = new ArrayExample3();
            obj.searchArray();
        }
    }

