package academy.exercise48;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private String  artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        if (songs.findSong(title) == null) {
            songs.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (songs.songs.size() < trackNumber - 1 || trackNumber <= 0 ) {
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }
        Song song = songs.findSong(songs.songs.get(trackNumber - 1).getTitle());
        if (song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = songs.findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (findSong(song.getTitle()) == null) {
                songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            Iterator<Song> it = songs.iterator();
            while (it.hasNext()) {
                Song song = it.next();
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int number) {
            int songIndex = 0;
            Iterator<Song> it = songs.iterator();
            while (it.hasNext()) {
                Song song = it.next();
                if (number == songIndex) {
                    return song;
                }
                songIndex++;
            }
            return null;
        }
    }
}