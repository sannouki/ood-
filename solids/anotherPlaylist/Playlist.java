package anotherPlaylist;
import java.util.ArrayList;
import java.util.List;


public class Playlist {
    private String name;
    private List <String> songs;
    private String genre;
//constructor    
    public Playlist(String name, String genre){
        this.name = name;
        this.songs = new ArrayList<>();
        this.genre = genre;
    }    


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSongs() {
        return this.songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void addSong(String song)
    {
        songs.add(song);
    }

    public void removeSong(String song)
    {
        songs.remove(song);
    }

    public void playAll()
    {
        System.out.println("playing all songs in playlist" + name);
    

    if(genre.equals("rock"))
    {
        System.out.println("this is a rock playlist");
    }
    else if(genre.equals("pop"))
    {
        System.out.println("this is a pop playlist");
    }
    else
    {
        System.out.println("this is a general playlist");
    }

    for(String song:songs)
    {
        System.out.println("playing" + song);
    }
}

}