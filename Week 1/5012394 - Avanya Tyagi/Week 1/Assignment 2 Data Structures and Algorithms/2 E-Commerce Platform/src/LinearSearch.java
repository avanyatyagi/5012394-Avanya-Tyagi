public class LinearSearch {
    public static Product LinearSearch(Product[] arr, String name){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getProductName().equalsIgnoreCase(name)){
                return arr[i];
            }
        }
        return null;
    }
}
