public class Album {
    private String title;
    private String artist;
    private int tracks;
    private double playTime;

    public Album(String albumTitle, String musician, int albumTracks, double time){
        title = albumTitle;
        artist = musician;
        tracks = albumTracks;
        playTime = time;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    //check to see if tracks and playtime printer work with Noah
    public String toString(){
        String result = "";
        result += "Album: " + title + "\nArtist: " + artist + "\n# of tracks: " + tracks + "\nPlay Time: " + playTime;
        return result;
    }
}
