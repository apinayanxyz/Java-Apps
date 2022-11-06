package CW1;

public class Song {
    /*
     * Main variables for metadata of songs
     */
    private String songTitle;
    private String artistName;
    private int numOfPlays;
    private int yearOfRelease;
    private int lengthMinute;
    private int lengthSecond;

    /*
     * Constructor for creating "song" object
     */
    public Song(String songTitle, String artistName, int numOfPlays, int yearOfRelease, int lengthMinute,
            int lengthSecond) {
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.numOfPlays = numOfPlays;
        this.yearOfRelease = yearOfRelease;
        this.lengthMinute = lengthMinute;
        this.lengthSecond = lengthSecond;
    }

    
}