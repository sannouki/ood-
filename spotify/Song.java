/*
 * title (String), artist (String), duration (double, in minutes)
b.	Methods:
●	Constructor to initialize the properties
●	Getters for each property

 */

public class Song {
   private String title;
   private String artist;
   private double duration; 
//constructor
public Song(String Title, String Artist, double Duration)
{
    this.title = Title;
    this.duration = Duration;
    this.artist = Artist;
}

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return this.duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }


}