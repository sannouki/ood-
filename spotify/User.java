

import java.util.*;
public class User {
    private String Username;
    ArrayList<Playlist> currentPlaylist = new ArrayList<Playlist>();

    public String getUsername() {
        return this.Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public ArrayList<Playlist> getMusicPlaylist() {
        return this.currentPlaylist;
    }

    public void setMusicPlaylist(ArrayList<Playlist> musicPlaylist) {
        this.currentPlaylist = musicPlaylist;
    }

public void CreatePlaylist(String name, String type)
{
    if(type.toLowerCase() == "jazz")
    {
        JazzPlaylist jazzplaylist = new JazzPlaylist("jazz playlist");
        this.currentPlaylist.add(jazzplaylist);
        System.out.println("jazz playlist has been made");
    }

    if(type.toLowerCase() == "rock")
    {
        RockPlaylist rockplaylist = new RockPlaylist("rock playlist");
        this.currentPlaylist.add(rockplaylist);
        System.out.println("rock playlist has been made");   
    }
    if(type.toLowerCase() == "pop")
    {
        PopPlaylist popplaylist = new PopPlaylist("pop playlist");
        this.currentPlaylist.add(popplaylist);
        System.out.println("pop playlist has been made");
    }
}
    //deletePlaylist(Playlist playlist): Deletes a specified playlist
    public void deletePlaylist(Playlist playlist)
    {
        this.currentPlaylist.remove(playlist);
    }

    public void addSongToPlaylist(Playlist playlist, Song song)
    {
        playlist.addSongs(song);
    }

    public void removeSongFromPlaylist(Playlist playlist, Song song)
    {
        playlist.removeSongs(song);
    }


}
