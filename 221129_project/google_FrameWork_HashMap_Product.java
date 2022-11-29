
// 다시.
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Product {
    private String name;
    private String description;
    private List<String> tags;

    public Product addTagsOfOtherProduct(Product product) {
        this.tags.addAll(product.getTags());
        return this;
    }
}

public class google_FrameWork_HashMap_Product {

    public static void main(String[] args) {
        Map<String, Product> productByName = new HashMap<>();
        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road bike", "A bike for competition");
        productsByName.put(eBike.getName(), eBike);
        productsByName.put(roadBike.getName(), roadBike);
    }

}
