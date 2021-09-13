package academy.part129;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Album album = new Album("Album title", "Song name", 3.33);
        Song song = album.newSong("Song 2", 2.54);
        Song song3 = album.newSong("Song 3", 5.45);
        player.getPlayList().add(song);
        player.getPlayList().add(song3);
        player.printPlaylist();
    }
}
