public class Album {

    private int id;
    private String artist;
    private String name;
    private String genre;

    public Album(String artist, String name, String genre) {
        this.artist = artist;
        this.name = name;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
