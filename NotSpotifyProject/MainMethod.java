package NotSpotifyProject;
//this will run the songs that is selected by the user
public class MainMethod {
    public static void main(String[] args) {
        User u = new User("user");
        System.out.println("Username: " + u.getUsername());
    
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
        System.out.println("rock");

        //adding songs to playlists
        u.addSongToPlaylist(pop, songA);
        u.addSongToPlaylist(pop, songB);
        u.addSongToPlaylist(pop, songC);
        
        u.addSongToPlaylist(rocklist, songA);
        u.addSongToPlaylist(rocklist, songB);
        u.addSongToPlaylist(rocklist, songC);
        
        //printing the songs in the arrays
        rocklist.playAllSongs();
        u.removeSongFromPlaylist(pop, songA);
        System.out.println("");
        System.out.println("pop");
        pop.playAllSongs();
    }
}
