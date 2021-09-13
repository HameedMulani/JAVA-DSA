public class Q22firstMisingPositive {

    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        sort(arr);
        System.out.println(firstMissingPositive1(arr));
    }
    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // correctIdx of Element should be element 
            // eg: element -> 3 = index -> 3 i.e = arr[i] 
            // index == element
            int correctIdx = arr[i] - 1 ; 
            if (arr[i] >= 1  && arr[i] <= arr.length && arr[correctIdx] != arr[i]) {
                // here i should be greater than 0 and ingnore greater than length value 
                // here arr[i] < n, because we cant put it in index, it is out of bond so "Ingnore N"
                // if the not Equal to there corresponding index then Swap
                swap(arr, i, correctIdx); 
            }else{
                i++;
            }
        }
    }
    // SEARCH FOR MISSING NUMBER
    public static int firstMissingPositive1(int arr[]) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
