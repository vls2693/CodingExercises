package academy.part129;

import java.util.ArrayList;
import java.util.Iterator;

public class Album {
    private String albumTitle;
    private SongList songs;

    public Album(String albumTitle, String songTitle, double songDuration) {
        this.albumTitle = albumTitle;
        this.songs = new SongList(songTitle, songDuration);
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public SongList getSongs() {
        return songs;
    }

    public void setSongs(SongList songs) {
        this.songs = songs;
    }

    public Song newSong(String songTitle, double songDuration) {
        return new Song(songTitle, songDuration);
    }

    public class SongList {
        private ArrayList<Song> songList;

        public SongList(String songTitle, double songDuration) {
            this.songList = new ArrayList<>();
            songList.add(newSong(songTitle, songDuration));
        }

        public ArrayList<Song> getSongList() {
            return songList;
        }

        public void printSongs() {
            Iterator<Song> iterator = songList.iterator();
            while (iterator.hasNext()) {
                Song song = iterator.next();
                System.out.println("Song with title " + song.getTitle() + " and duration " + song.getDuration());
            }
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

        public boolean addSong(String songTitle, double songDuration) {
            if (findSong(songTitle) != null) {
                return false;
            }
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
    }
}
