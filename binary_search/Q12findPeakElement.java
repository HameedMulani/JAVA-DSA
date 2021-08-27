package code.binary_search;
// *this is same Q, Easy find peak in Mountain array*
public class Q12findPeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
            while(start < end){
                int mid = start + (end - start) / 2;

                if(arr[mid] > arr[mid + 1]){
                    // it means u r in Decrearing Order
                    // mid also the ans
                    end = mid;
                }else{
                    // it means u r in Increasing Order 
                    // we knows that [mid + 1] element is > mid so, we ignoring mid element
                    start = mid + 1;
                } 
            }
        // because of the 2 checks above the come at best element
        // break when start == end 
        return start; // or return end; both are Equal == 
    }
}
