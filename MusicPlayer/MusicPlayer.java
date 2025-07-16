package MusicPlayer;

import java.util.LinkedList;

public class MusicPlayer extends MediaPlayer {
    private LinkedList<Song> playlist;

    public MusicPlayer() {
        this.playlist = new LinkedList<>();
    }

    // Abstraction: Add song
    public void addSong(Song song) {
        playlist.addLast(song);
        System.out.println("Added: " + song);
    }

    // Abstraction: Remove song
    public void removeSong() {
        if (!playlist.isEmpty()) {
            Song removed = playlist.removeFirst();
            System.out.println("Removed: " + removed);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    // Implements abstract method from MediaPlayer
    @Override
    public void playNext() {
        if (!playlist.isEmpty()) {
            Song current = playlist.removeFirst();
            System.out.println("Now playing: " + current);
        } else {
            System.out.println("No songs left to play.");
        }
    }

    // View the current playlist
    public void showPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Current Playlist:");
            for (Song song : playlist) {
                System.out.println("- " + song);
            }
        }
    }
}
