package crudproject;

import java.util.LinkedList;
import java.util.ListIterator;

public class MusicPlaylist {

    LinkedList<String> playlist = new LinkedList<>();
    ListIterator<String> iterator = playlist.listIterator();
    String currentSong = null;

    // Add song
    public void addSong(String song) {
        playlist.add(song);
        System.out.println(song + " added to playlist.");
        iterator = playlist.listIterator();
    }

    // Play next song
    public void playNext() {
        if (iterator.hasNext()) {
            currentSong = iterator.next();
            System.out.println("Playing Next: " + currentSong);
        } else {
            System.out.println("End of playlist!");
        }
    }

    // Play previous song
    public void playPrev() {
        if (iterator.hasPrevious()) {
            currentSong = iterator.previous();
            System.out.println("Playing Previous: " + currentSong);
        } else {
            System.out.println("No previous song!");
        }
    }

    // Remove song
    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println("Removed: " + song);
        } else {
            System.out.println("Song not found.");
        }
    }

    // Display all songs
    public void showPlaylist() {
        System.out.println("----- Playlist -----");
        for (String s : playlist) {
            System.out.println(s);
        }
    }
}
