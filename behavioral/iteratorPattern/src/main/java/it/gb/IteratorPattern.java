package it.gb;

import java.util.Iterator;

import it.gb.generic.ShortList;
import it.gb.musicLibrary.MusicLibrary;
import it.gb.musicLibrary.Song;

public class IteratorPattern {

    public static void executeGeneric(Short[] shortArray) {
        // SImple Short List
        ShortList sl = new ShortList(shortArray);
        while(sl.iterator().hasNext()) {
            System.out.println(sl.iterator().next());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Iterator Pattern!");

        // uncomment to play generic iterator on a simple list 
        // executeGeneric(new Short[]{Short.MIN_VALUE, 100, 10005, 8474, 3945, Short.MAX_VALUE});

        // An overcomplicated music library
        MusicLibrary myPlaylist = new MusicLibrary();
        myPlaylist.addSong(new Song(
            "Song C",
            "Artist B",
            Short.parseShort("2023"),
            Short.parseShort("150")
        ));
        myPlaylist.addSong(new Song(
            "Song B",
            "Artist A",
            "Album X",
            Short.parseShort("2022"),
            Short.parseShort("100")
        ));
        myPlaylist.addSong(new Song(
            "Song A",
            "Artist D",
            Short.parseShort("2020"),
            Short.parseShort("126")
        ));
        myPlaylist.addSong(new Song(
            "Song A",
            "Artist A",
            "Album X",
            Short.parseShort("2020"),
            Short.parseShort("126")
        ));
        myPlaylist.addSong(new Song(
            "Song D",
            "Artist D",
            "Album Y",
            Short.parseShort("2020"),
            Short.parseShort("126")
        ));

        // This is equals to...
        Iterator<Song> iterator = myPlaylist.iterator(); // Inizializza l'iteratore

        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println(song);
        }

        // ..this. But it is done under the hood
        // for (Song song : myPlaylist) {
        //     System.out.println(song);
        // }
    }
}
