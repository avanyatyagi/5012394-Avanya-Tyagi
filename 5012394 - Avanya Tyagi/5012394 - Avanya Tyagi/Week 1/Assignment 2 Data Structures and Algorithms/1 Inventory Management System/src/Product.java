public class Product {
    String productId;
    String productName;
    long quantity;
    double price;

    public Product(String productId, String productName, long quantity, double price){
        this.productId=productId;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }

    public String getProductId(){
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName(){
        return productName;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getQuantity(){
        return quantity;
    }
}
