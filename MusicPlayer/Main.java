package MusicPlayer;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        Song s1 = new Song("Perfect", "Ed Sheeran");
        Song s2 = new Song("Blinding Lights", "The Weeknd");
        Song s3 = new Song("Levitating", "Dua Lipa");

        player.addSong(s1);
        player.addSong(s2);
        player.addSong(s3);

        player.showPlaylist();

        player.playNext(); // Ed Sheeran
        player.playNext(); // The Weeknd

        player.removeSong(); // Removes Dua Lipa
        player.playNext();   // No songs left
    }
}