package sec_8_arays_java_inbuilt_lists_autoboxing_unboxing.linkedlist.playlist_challenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String songName) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(songName)) {
                return checkedSong;
            }
        }
        return null;
    }
}
