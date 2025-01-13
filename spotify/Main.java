public class Main {
    public static void main(String[] args) {
        User u = new User();
        System.out.println("Username: " + u.getUsername());
    
        // Create songs
        Song songA = new Song("song1", "guy", 3);
        Song songB = new Song("song2", "girl", 3);
        Song songC = new Song("song3", "thing", 3);
        
        // Create a rock playlist
        RockPlaylist rocklist = new RockPlaylist("rock playlist");
        u.CreatePlaylist("LA", "rock");
        
        //create a pop playlist
        PopPlaylist pop = new PopPlaylist("pop playlist");
        u.CreatePlaylist("LA", "pop");
        

        //adding songs to playlists
        u.addSongToPlaylist(pop, songA);
        u.addSongToPlaylist(pop, songB);
        u.addSongToPlaylist(pop, songC);
        
        u.addSongToPlaylist(rocklist, songA);
        u.addSongToPlaylist(rocklist, songB);
        u.addSongToPlaylist(rocklist, songC);

        pop.playAllSongs();
        
    }
}
