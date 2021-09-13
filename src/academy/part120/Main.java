package academy.part120;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.createAlbum();
        player.addSongToAlbum();
        player.addSongToAlbum();
        player.addSongToAlbum();
        player.addSongToAlbum();
        System.out.println("====================");
//        player.printSongList();
        player.addSongToPlaylist();
        player.addSongToPlaylist();
        player.addSongToPlaylist();
        player.addSongToPlaylist();
        player.addSongToPlaylist();
        System.out.println("====================");

        player.printPlaylist();
//        player.removeSongFromPlaylist();
//        player.printPlaylist();
        player.managePlayer();
    }
}
