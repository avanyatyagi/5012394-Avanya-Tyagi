import java.util.HashMap;
import java.util.Map;

public class StorageManagement {
    public  Map<String, Product> stock;
    public StorageManagement (){
        stock=new HashMap<>();
    }

    public void addProduct(Product item){
        stock.put(item.getProductId(), item);
    }

    public void updateProduct(String productId, Product newProduct){
        if(stock.containsKey(productId)){
            stock.put(productId,newProduct);
        }
        else{
            System.out.println("Product Not found");
        }
    }

    public void deleteProduct(String productId){
        if(stock.containsKey(productId)){
            stock.remove(productId);
        } else{
            System.out.println("Product not found");
        }
    }

    public static void main(String[] args) {
        Product pro1 = new Product("P1", "Headphone", 10, 1999);
        Product pro2 = new Product("P2", "IPad", 20, 10000);
        StorageManagement stock=new StorageManagement();

//        Adding a product.
        stock.addProduct(pro1);
        stock.addProduct(pro2);

//        Updating the product.
        stock.updateProduct("P1", new Product("P2", "IPad", 60, 15000));

//        Deleting a product.
        stock.deleteProduct("P1");
    }
}
