public class Book {
    private String name, author, genre, date;
    private int id;

    public Book(int id, String name, String author, String genre, String date) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.date = date;
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getDate() {
        return this.date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDate(String date) {
        this.date = date;
    }

//    public String toString() {
//        return this.id + " " + this.name + " " + this.author + " " + this.genre + " " + this.date;
//    }
    public String toString() {
        return String.format("%-5s %-40s %-30s %-20s %-15s",
                id, name, author, genre, date);
    }
}
