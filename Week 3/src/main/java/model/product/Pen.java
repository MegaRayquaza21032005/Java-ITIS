package model.product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pen extends Product{
    private String color, material, inkType, nibSize;

    public Pen(String name, String price, String brand, String color, String material, String inkType, String nibSize) {
        super(name, price, brand);
        this.color = color;
        this.material = material;
        this.inkType = inkType;
        this.nibSize = nibSize;
    }
}
