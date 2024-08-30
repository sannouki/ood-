/*requirements

Base Class: Playlist
Properties: 
‘name’ (String), ‘songs’ (List of Song objects) done
Methods:
addSong(Song song)
removeSong(Song song)
playAllSongs()

 */
package NotSpotifyProject;

import java.util.ArrayList;

public class Playlist {
    // creating properties for the playlist
    private String name;
    public ArrayList<Song> songsList = new ArrayList<Song>(); // songs (list of songs object)

    // Constructor
    public Playlist(String name) {
        this.name = name;
    }

    // getter and setter for name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter and setters for the songs array list
    public ArrayList<Song> getSongsList() {
        return this.songsList;
    }

    public void setSongsList(ArrayList<Song> songsList) {
        this.songsList = songsList;
    }

    // Method to add a song to the playlist, returns the updated list of songs
    public void addSong(Song song) {
        songsList.add(song);
    }

    public void removeSong(Song song) {
        songsList.remove(song);
    }
    //print all the items name and author names stored in the array.
    public void playAllSongs() {
        for (int i = 0; i < songsList.size(); i++) {
            Song song = songsList.get(i);
            System.out.print(" title: "+song.getTitle());
            System.out.print(" author: "+song.getArtist());
            System.out.println("");
        }

    }
}