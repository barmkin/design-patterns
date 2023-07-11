package it.gb.musicLibrary;

public class Song {
    private String title;
    private String artist;
    private String album;
    private short year;
    private short durationInSeconds;
    
    public Song(String title, String artist, short year, short durationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.durationInSeconds = durationInSeconds;
    }

    public Song(String title, String artist, String album, short year, short durationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.durationInSeconds = durationInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public short getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(short durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((artist == null) ? 0 : artist.hashCode());
        result = prime * result + ((album == null) ? 0 : album.hashCode());
        result = prime * result + year;
        result = prime * result + durationInSeconds;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Song other = (Song) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (artist == null) {
            if (other.artist != null)
                return false;
        } else if (!artist.equals(other.artist))
            return false;
        if (album == null) {
            if (other.album != null)
                return false;
        } else if (!album.equals(other.album))
            return false;
        if (year != other.year)
            return false;
        if (durationInSeconds != other.durationInSeconds)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year
                + ", durationInSeconds=" + durationInSeconds + "]";
    }
}
