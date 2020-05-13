package sample.Model;

public class Movie {
    private int id;
    private String title;
    private String author;
    private double rating;
    private String platform;
    private String genre;
    private int userId;


    public Movie(int id, String title, String author, double rating, String platform, String genre, int userId) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.platform = platform;
        this.genre = genre;
        this.userId = userId;
    }

    public Movie(String title, String author, double rating, String platform, String genre, int userId) {
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.platform = platform;
        this.genre = genre;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", rating=" + rating +
                ", platform='" + platform + '\'' +
                ", genre='" + genre + '\'' +
                ", userId=" + userId +
                '}';
    }
}
