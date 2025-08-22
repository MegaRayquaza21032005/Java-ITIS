package model.product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pencil extends Product{
    private String color, material, hardness;

    public Pencil(String name, String price, String brand, String color, String material, String hardness) {
        super(name, price, brand);
        this.color = color;
        this.material = material;
        this.hardness = hardness;
    }
}
