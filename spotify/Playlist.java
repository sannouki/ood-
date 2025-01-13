import java.util.ArrayList;

public class Playlist {
    private String name;
    public ArrayList<Song> songsList = new ArrayList<Song>();

public Playlist(String name)
{
this.name = name;
//ArrayList<Song> songslist = new ArrayList<>();

}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongsList() {
        return this.songsList;
    }

    public void setSongsList(ArrayList<Song> songsList) {
        this.songsList = songsList;
    }

    public ArrayList<Song> getSongs() {
        return this.songsList;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songsList = songs;
    }

//methods
public void addSongs(Song song)
{
    songsList.add(song);
}

public void removeSongs(Song song)
{
    songsList.remove(song);
}

public void playAllSongs()
{
    for(int i=0; i < songsList.size(); i++)
    {
    Song song = songsList.get(i);
    System.out.println(song.getTitle());
    System.out.println(song.getDuration());
    System.out.println("time: "+ song.getDuration());
}
}
}