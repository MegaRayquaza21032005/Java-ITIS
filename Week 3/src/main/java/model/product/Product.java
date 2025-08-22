package model.product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String name;
    private String price;
    private String brand;

    public Product(String name, String price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }
}
