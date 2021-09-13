package academy.part120;

import java.util.ArrayList;
import java.util.Iterator;

public class Album {
    private String albumTitle;
    private ArrayList<Song> songList;

    public Album(String albumTitle, String songTitle, double songDuration) {
        this.albumTitle = albumTitle;
        this.songList = new ArrayList<>();
        songList.add(newSong(songTitle, songDuration));
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public Song newSong(String songTitle, double songDuration) {
        return new Song(songTitle, songDuration);
    }

    public boolean addSong(String songTitle, double songDuration) {
//        if (findSong(songTitle) != null) {
//            return false;
//        }
        songList.add(newSong(songTitle, songDuration));
        return true;
    }

    public boolean removeSong(String songTitle) {
        for (int i = 0; i < songList.size(); i++) {
            if (songList.get(i).getTitle().equals(songTitle)) {
                songList.remove(i);
                return true;
            }
        }
        return false;
    }

    public Song findSong(String songTitle) {
        Iterator<Song> songIterator = songList.iterator();
        while (songIterator.hasNext()) {
            Song song = songIterator.next();
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }

    public void printSongs() {
        Iterator<Song> iterator = songList.iterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Song with title " + song.getTitle() + " and duration " + song.getDuration());
        }
    }
}
