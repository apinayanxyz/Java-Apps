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
    //Getter and setter for Song Title
    public String getSongTitle() {
        return songTitle;
    }
    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }
    //Getter and setter for Artist name
    public String getArtistName() {
        return artistName;
    }
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    //Getter and setter for Number of plays
    public int getNumOfPlays() {
        return numOfPlays;
    }
    public void setNumOfPlays(int numOfPlays) {
        this.numOfPlays = numOfPlays;
    }
    //Getter and setter for Year of release
    public int getYearOfRelease() {
        return yearOfRelease;
    }
    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    //Getter and setter for Minutes in song
    public int getLengthMinute() {
        return lengthMinute;
    }
    public void setLengthMinute(int lengthMinute) {
        this.lengthMinute = lengthMinute;
    }
    //Getter and setter for Seconds in song
    public int getLengthSecond() {
        return lengthSecond;
    }
    public void setLengthSecond(int lengthSecond) {
        this.lengthSecond = lengthSecond;
    }
}