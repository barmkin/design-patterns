package it.gb.musicLibrary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SongIterator implements Iterator<Song> {

    private final MusicLibrary library;
    private Song currentSong;

    protected SongIterator(MusicLibrary library) {
        this.library = library;
        this.currentSong = null;
    }

    private List<Song> getSongList() {
        List<Song> songList = new ArrayList<Song>();
        for (Song song : library.getSongs()) {
            songList.add(song);
        }
        songList.sort(new Comparator<Song>() {
            @Override
            public int compare(Song song1, Song song2) {
                int compareArtists = song1.getArtist().toLowerCase().compareTo(song2.getArtist().toLowerCase());
                if (compareArtists != 0) {
                    return compareArtists;
                }
                int compareTitle = song1.getTitle().toLowerCase().compareTo(song2.getTitle().toLowerCase());
                return compareTitle;
            }
        });
        return songList;
    }

    private boolean currentIsTheLastSong() {
        if (this.currentSong == null && library.getSongs().size() > 0) {
            return false;
        }
        List<Song> songList = this.getSongList();
        
        return songList.lastIndexOf(currentSong) == songList.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return library != null && library.getSongs().size() > 0 && 
        (this.currentSong == null || !currentIsTheLastSong());
    }

    @Override
    public Song next() {
        // For exercise purpose always return next song ordered by artist
        // this method is computationally awful
        if (!currentIsTheLastSong()) {
            List<Song> songList = this.getSongList();

            if (currentSong == null) {
                currentSong = songList.get(0);
            } else {
                int currSongIndex = songList.lastIndexOf(currentSong);
                currentSong = songList.get(currSongIndex + 1);
            }
        }
        
        return currentSong;
    }

    @Override
    public void remove() {
        this.library.getSongs().remove(currentSong);
        currentSong = next();
    }
    
}
