package code.SORTING;
import java.util.Arrays;

/**
 * bubble_sort // exchange sort // STABLE  
 * O(n) * O(n) = O(n^2)
 * time coplexcity O(n^2) in worst case 
 */
public class bubble_sort {
public static void main(String[] args) {
    int[] arr = {7, 7, 4, 1, 2, 3};
    bubble(arr);
    System.out.println(Arrays.toString(arr));
}

public static void bubble(int arr[]) {
    // run the step n -1 timeer
    boolean swapped;
    for (int i = 0; i < arr.length; i++) { // O(n)
        swapped = false;
        // for each step, max item will come at the last respective index
        for (int j = 1; j < arr.length - i; j++){ // O(n)
            // swap if the item is smaller than the previous item
            if(arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    swapped = true;
                }
            }
            // if alredy sorted then "break", Or if did nit swap for a perticular value of i, it means arr is sorted then "break"  
            if(swapped == false){
                break;
            }
        }
    }

}