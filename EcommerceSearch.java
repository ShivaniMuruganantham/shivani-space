import java.util.*;


class Product implements Comparable<Product> {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.productId, other.productId);
    }

    @Override
    public String toString() {
        return "[" + productId + ", " + productName + ", " + category + "]";
    }
}

public class EcommerceSearch {

    
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }

    
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(203, "T-Shirt", "Clothing"),
            new Product(150, "Phone", "Electronics"),
            new Product(300, "Book", "Stationery")
        };

        
        Arrays.sort(products);

        int searchId = 150;

        System.out.println("Searching using Linear Search...");
        Product result1 = linearSearch(products, searchId);
        System.out.println(result1 != null ? "Found: " + result1 : "Product not found");

        System.out.println("Searching using Binary Search...");
        Product result2 = binarySearch(products, searchId);
        System.out.println(result2 != null ? "Found: " + result2 : "Product not found");
    }
}