package model.product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book extends Product{
    private String author, genre, publishDate, publisher, language;

    public Book(String name, String price, String brand, String author, String genre, String publishDate, String publisher, String language) {
        super(name, price, brand);
        this.author = author;
        this.genre = genre;
        this.publishDate = publishDate;
        this.publisher = publisher;
        this.language = language;
    }
}
