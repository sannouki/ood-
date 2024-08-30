/*
 * Properties: username (String), playlists (List of Playlist objects)

Methods:
●	createPlaylist(String name, String type): Creates a playlist of a specified type (Pop, Rock, Jazz)
●	deletePlaylist(Playlist playlist): Deletes a specified playlist
●	addSongToPlaylist(Playlist playlist, Song song)
●	removeSongFromPlaylist(Playlist playlist, Song song)

*/
package NotSpotifyProject;

import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<Playlist> playlists = new ArrayList<>();

    // Constructor
    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }
    public void createPlaylist(String name, String type) {
//create a playlist and make sure the spelling doesnt matter as long as the correct letters are there.
        if (type.toLowerCase().equals("rock")) {
            RockPlaylist rockplaylist = new RockPlaylist("rock playlist");
            this.playlists.add(rockplaylist);
            System.out.println("a rock playlist has been made");
        }
        if (type.toLowerCase().equals("pop")) {
            RockPlaylist popPlaylist = new RockPlaylist("rock playlist");
            this.playlists.add(popPlaylist);
            System.out.println("a pop playlist has been made");
        }
        if (type.toLowerCase().equals("jazz")) {
            RockPlaylist JazzPlaylist = new RockPlaylist("rock playlist");
            this.playlists.add(JazzPlaylist);
            System.out.println("a jazz playlist has been made");
        }
    }

    // ● deletePlaylist(Playlist playlist): Deletes a specified playlist
    public void deletePlaylist(Playlist playlist) {
        if (playlists.remove(playlist)) {
            System.out.println("Playlist " + playlist.getName() + " has been deleted.");
        }
    }

    // add songs ● addSongToPlaylist(Playlist playlist, Song song)
    //add songs to the array
    public void addSongToPlaylist(Playlist playlist, Song song) {
        if (playlist.getName().contains(song.getTitle())) {
            System.out.println("song is already in playlist");
        } else {
            playlist.addSong(song);
        }
    }
    //remove a song from the array
    public void removeSongFromPlaylist(Playlist playlist, Song song) {
        if (playlist.getName().contains(song.getTitle())) {
            System.out.println("song doesnt exist in playlist");
        } else {
            playlist.removeSong(song);
        }
    }

    public static void main(String[] args) {
        User u = new User("user");
        System.out.println("Username: " + u.username);
    
        // Create songs
        Song songA = new Song("song1", "guy", 3);
        Song songB = new Song("song2", "girl", 3);
        Song songC = new Song("song3", "thing", 3);
        
        // Create a rock playlist
        RockPlaylist rocklist = new RockPlaylist("rock playlist");
        u.createPlaylist("LA", "rock");
        
        //create a pop playlist
        PopPlaylist pop = new PopPlaylist("pop playlist");
        u.createPlaylist("LA", "pop");
        u.addSongToPlaylist(pop, songA);
        u.addSongToPlaylist(pop, songB);
        u.addSongToPlaylist(pop, songC);
        
        u.addSongToPlaylist(rocklist, songA);
        u.addSongToPlaylist(rocklist, songB);
        u.addSongToPlaylist(rocklist, songC);
        

        rocklist.playAllSongs();
        u.removeSongFromPlaylist(pop, songA);
        System.out.println("");
        System.out.println("pop");
        pop.playAllSongs();
    }
}
