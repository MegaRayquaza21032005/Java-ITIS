package model.product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteBook extends Product {
    private String numberOfPages, notebookType, coverColor, paperMaterial, size;

    public NoteBook(String name, String price, String brand, String numberOfPages, String notebookType, String coverColor, String paperMaterial, String size) {
        super(name, price, brand);
        this.numberOfPages = numberOfPages;
        this.notebookType = notebookType;
        this.coverColor = coverColor;
        this.paperMaterial = paperMaterial;
        this.size = size;
    }
}
