//this will create a category that will be able to hold products.
//different products can be added or remove from the category.
//each category will have a name, list, and total price.
import java.util.ArrayList;
import java.util.List;

public class Category extends ProductComponent {
    private String name;
    private List<ProductComponent> products = new ArrayList<>(); // List of products in this category

    public Category(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
//catefory will not have a price
    @Override
    public double getPrice() {
        return 0;
    }

    // Add a product to the category
    public void add(ProductComponent productComponent) {
        products.add(productComponent);
    }

    // Remove a product from the category
    public void remove(ProductComponent productComponent) {
        products.remove(productComponent);
    }

    public void display() {
        System.out.println("Category: " + getName());
        for (int i = 0; i < products.size(); i++) {
            products.get(i).display();
        }
    }
}