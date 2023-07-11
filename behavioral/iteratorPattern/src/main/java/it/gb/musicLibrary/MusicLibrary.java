package it.gb.musicLibrary;

import java.util.HashSet;
import java.util.Set;

public class MusicLibrary implements Iterable<Song> {
    private SongIterator songIterator = null;
    private final Set<Song> songs;
    
    public MusicLibrary() {
        super();
        this.songs = new HashSet<Song>();
        this.songIterator = new SongIterator(this);
    }
    
    protected Set<Song> getSongs() {
        return songs;
    }

    public boolean addSong(Song song) {
        return this.songs.add(song);
    }

    @Override
    public SongIterator iterator() {
        return this.songIterator;
    }

    
}
