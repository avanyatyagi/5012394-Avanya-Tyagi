import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product BinarySearch(Product[] arr, String pName){
        Arrays.sort(arr, Comparator.comparing(Product::getProductName));
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=low + (high - low)/2;
            int item=arr[mid].getProductName().compareToIgnoreCase(pName);

            if(item ==0){
                return arr[mid];
            } else if (item<0) {
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return null;
    }
}
