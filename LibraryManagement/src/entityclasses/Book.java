package entityclasses;

public class Book {
    private String title;
    private String author;
    private String category;
    private boolean availability;

    public Book(String title, String author, String category, boolean availability) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.availability = availability;
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}

