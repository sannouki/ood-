/*
 * a.	Properties: title (String), artist (String), duration (double, in minutes)
b.	Methods:
●	Constructor to initialize the properties
●	Getters for each property

 */
package NotSpotifyProject;

public class Song {
    private String Title;
    private String Artist;
    private double Duration;
//constructor. define the title, author, and how long the song is
public Song(String Title, String Artist, double Duration)
{
    this.Title = Title;
    this.Artist = Artist;
    this.Duration = Duration;
}
    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getArtist() {
        return this.Artist;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public double getDuration() {
        return this.Duration;
    }

    public void setDuration(double Duration) {
        this.Duration = Duration;
    }

}