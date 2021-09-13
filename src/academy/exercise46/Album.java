package academy.exercise46;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private String  artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
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

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (songs.size() < trackNumber - 1 || trackNumber <= 0 ) {
            return false;
        }
        Song song = findSong(songs.get(trackNumber - 1).getTitle());
        if (song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }
}