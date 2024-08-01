public class Product {
    String productId;
    String productName;
    String category;

    public Product(String productId, String productName, String category){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }

    public String getProductId(){
        return productId;
    }

    public String getCategory() {
        return category;
    }

    public String getProductName() {
        return productName;
    }
}
