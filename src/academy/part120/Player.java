package academy.part120;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Player {
    private ArrayList<Album> albumList;
    private LinkedList<Song> playList;
    Scanner scanner = new Scanner(System.in);

    public Player() {
        this.albumList = new ArrayList<>();
        this.playList = new LinkedList<>();
    }

    //    MENU METHODS
    public void menu() {
        System.out.println("Select one of the options below:");
        System.out.println("1 - Open player");
        System.out.println("2 - Add song to the playlist");
        System.out.println("3 - Remove song from the playlist");
        System.out.println("4 - Create album");
        System.out.println("5 - Add song to album");
        System.out.println("6 - Print album");
        System.out.println("7 - Print playlist");
        System.out.println("0 - Exit");
        int number = scanner.nextInt();
        do {
            switch (number) {
                case 1:
                    managePlayer();
                    break;
                case 2:
                    addSongToPlaylist();
                    break;
                case 3:
                    removeSongFromPlaylist();
                    break;
                case 4:
                    createAlbum();
                    break;
                case 5:
                    addSongToAlbum();
                    break;
                case 6:
                    printSongList();
                    break;
                case 7:
                    printPlaylist();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong number. Choose from 0 to 7");
                    break;
            }
            System.out.println("Select one of the options below:");
            System.out.println("1 - Open player");
            System.out.println("2 - Add song to the playlist");
            System.out.println("3 - Remove song from the playlist");
            System.out.println("4 - Create album");
            System.out.println("5 - Add song to album");
            System.out.println("6 - Print album");
            System.out.println("7 - Print playlist");
            System.out.println("0 - Exit");
            number = scanner.nextInt();
        } while (number != 0);
    }


//    PLAYLIST METHODS
    public void managePlayer() {
        ListIterator<Song> listIterator = playList.listIterator();
        System.out.println("Select one of the options below:");
        System.out.println("1 - Play current song");
        System.out.println("2 - Skip to the next song");
        System.out.println("3 - Skip to the previous song");
        System.out.println("0 - Exit");
        boolean goingForward = true;
        int option = scanner.nextInt();
        Song song = listIterator.next();
        do {
            switch (option) {
                case 1:
                    System.out.println("Playing song " + song.getTitle());
                    break;
                case 2:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        song = listIterator.next();
                        System.out.println("Playing the next song " + song.getTitle());
                    }
                    else {
                        System.out.println("The end of the playlist");
                        song = listIterator.previous();
                        goingForward = false;
                    }
                    break;
                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        song = listIterator.previous();
                        System.out.println("Playing the previous song " + song.getTitle());
                    }
                    else {
                        System.out.println("The start of the playlist");
                        goingForward = true;
                        song = listIterator.next();
                    }
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong number. Choose from 0 to 3");
                    break;
            }
            System.out.println("Select one of the options below:");
            System.out.println("1 - Play current song");
            System.out.println("2 - Skip to the next song");
            System.out.println("3 - Skip to the previous song");
            System.out.println("0 - Exit");
            option = scanner.nextInt();
        } while (option != 0);
    }

    public boolean addSongToPlaylist() {
        System.out.println("Enter the album title");
        String albumTitle = scanner.next();
        Album album = findAlbum(albumTitle);
        if (album == null) {
            System.out.println("Album doesn't exist");
            return false;
        }
        System.out.println("Enter the song title");
        String songTitle = scanner.next();
        Song song = album.findSong(songTitle);
        if (song == null) {
            System.out.println("Song doesn't exist");
            return false;
        }
        playList.add(song);
        System.out.println("Song " + song.getTitle() + " has been added to the playlist");
        return true;
    }

    public void printPlaylist() {
        ListIterator<Song> listIterator = playList.listIterator();
        while (listIterator.hasNext()) {
            Song song = listIterator.next();
            System.out.println("Song " + song.getTitle() + " with duration " +
                    song.getDuration());
        }
    }

    public boolean removeSongFromPlaylist() {
        System.out.println("Enter the song title");
        String songTitle = scanner.next();
        ListIterator<Song> listIterator = playList.listIterator();
        while (listIterator.hasNext()) {
            Song song = listIterator.next();
            if (song.getTitle().equals(songTitle)) {
                playList.remove(song);
                System.out.println("Song with title " + song.getTitle() + "has been deleted from playlist");
                return true;
            }
        }
        System.out.println("Song with title " + songTitle + "doesn't exist in the playlist and can't be deleted");
        return false;
    }

    //    ALBUM METHODS
    public boolean createAlbum() {
        System.out.println("Enter the album title");
        String albumTitle = scanner.next();
        Album album = findAlbum(albumTitle);
        if (album != null) {
            System.out.println("Album already exists");
            return false;
        }
        System.out.println("Enter the song title");
        String songTitle = scanner.next();
        System.out.println("Enter the song duration");
        double songDuration = scanner.nextDouble();
        Album newAlbum = new Album(albumTitle, songTitle, songDuration);
        albumList.add(newAlbum);
        System.out.println("Album " + newAlbum.getAlbumTitle() + " has been created");
        System.out.println("Song " + songTitle + " has been created and added to the album");
        return true;
    }

    public boolean addSongToAlbum() {
        System.out.println("Enter the album title");
        String albumTitle = scanner.next();
        Album album = findAlbum(albumTitle);
        if (album == null) {
            System.out.println("Album doesn't exist");
            return false;
        }
        System.out.println("Enter the song title");
        String songTitle = scanner.next();
        Song song = album.findSong(songTitle);
        if (song != null) {
            System.out.println("Song already exists");
            return false;
        }
        System.out.println("Enter the song duration");
        double songDuration = scanner.nextDouble();
        album.addSong(songTitle, songDuration);
        System.out.println("Song " + songTitle + " has been created and added to the " + album.getAlbumTitle() +
                " album");
        return true;
    }

    public boolean printSongList() {
        System.out.println("Enter the album title");
        String albumTitle = scanner.next();
        Album album = findAlbum(albumTitle);
        if (album == null) {
            System.out.println("Album doesn't exist");
            return false;
        }
        System.out.println("Album size is " + album.getSongList().size());
        album.printSongs();
        return true;
    }

    public Album findAlbum(String albumTitle) {
        for (int i = 0; i < albumList.size(); i++) {
            if (albumList.get(i).getAlbumTitle().equals(albumTitle)) {
                return albumList.get(i);
            }
        }
        return null;
    }
}
