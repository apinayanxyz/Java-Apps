package CW1;
/*
 * The main class which produces a menu that allows the user to do the following:
 * 1.Add songs to the list
 * 2.Remove songs to the list
 * 3.Print all the songs in the list
 * 4.Print all songs that have more than a certain amount of plays
 * 5.Close the program
 * @author: Apinayan Kanenthirarasa
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

import helpers.InputReader;

public class Main {

    static ArrayList<Song> songList = new ArrayList<Song>();

    /*
     * This method will start the menu that the user will use.
     */
    public static void main(String[] args) throws Exception {

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  CW1 Assignment ");
        System.out.println();
        System.out.println(" by Apinayan Kanenthirarasa");
        System.out.println();
        System.out.println("------------------------------------------------------");
        addPresetSongs();
        startMenu();

    }

    // This method adds songs into the list before the menu starts
    private static void addPresetSongs() {
        Song[] initialList = new Song[10];
        initialList[0] = new Song("Did you see the sunrise", "Chogakusei", 145601, 2022, 4, 43);
        initialList[1] = new Song("Welcome to the Black Parade", "My Chemical Romance", 582013499, 2006, 5, 11);
        initialList[2] = new Song("The Ghost Show", "Arai Tasuku", 9380, 2022, 4, 54);
        initialList[3] = new Song("Happier Than Ever", "Billie Eilish", 824758798, 2021, 5, 58);
        initialList[4] = new Song("Photograph", "Ed Sheeran", 1995299615, 2014, 4, 18);
        initialList[5] = new Song("Shivers", "Ed Sheeran", 1004216748, 2021, 3, 27);
        initialList[6] = new Song("Glimpse of Us", "Joji", 597247251, 2022, 3, 53);
        initialList[7] = new Song("I'll Be Good", "James Young", 181015008, 2017, 4, 07);
        initialList[8] = new Song("Nascence", "Austin Wintory", 15635781, 2012, 1, 46);
        initialList[9] = new Song("Threshold", "Austin Wintory", 4921553, 2012, 6, 05);
        for (int i = 0; i < 10; i++) {
            songList.add(initialList[i]);
        }
    }

    /*
     * This method will provide the user with the options mentioned above.
     * This menu has been given its own method to allow for the program to call the
     * menu after a task has been complete.
     */
    private static void startMenu() {
        System.out.println("Main Menu");
        System.out.println(" \n Please choose 1 from the options below");
        System.out.println("------------------------------------------");
        System.out.println("  1. Add a song");
        System.out.println("  2. Remove a song");
        System.out.println("  3. Print all songs");
        System.out.println("  4. Print all songs over chosen number of plays");
        System.out.println("  5. Prints top 10 songs by plays");
        System.out.println("  6. Print songs released in a certain year");
        System.out.println("  7. Exit program");
        System.out.println("------------------------------------------ \n");
        String userInp = InputReader.getString("> ");
        switch (userInp) {
            case "1":
                addSong();
                break;
            case "2":
                deleteSong();
                break;
            case "3":
                printSongs();
                break;
            case "4":
                printSongsOverNoPlays();
                break;
            case "5":
                printTop10();
                break;
            case "6":
                printSongsFromAYear();
                break;
            case "7":
                exit();
                break;
            default:
                System.out.println("Invalid option chosen");
                System.out.println("Please pick from one of the options above");
                startMenu();
        }

        System.out.println("------------------------------------------");
    }

    /*
     * Prints the top 10 songs or, if there are not 10 songs in the list, all songs
     * sorted in play order
     */
    private static void printTop10() {
        System.out.println("------------------------------------------");
        System.out.println("Top 10 song list");
        boolean bubbleSorted = false;
        Song[] tempList = new Song[songList.size()];
        for (int i = 0; i < tempList.length; i++) {
            tempList[i] = songList.get(i);
        }
        do {
            bubbleSorted = true;
            for (int i = 0; i < tempList.length - 1; i++) {
                Song tempSong1 = tempList[i];
                Song tempSong2 = tempList[i + 1];
                if (tempSong1.getNumOfPlays() < tempSong2.getNumOfPlays()) {
                    Song tempSong = tempList[i];
                    tempList[i] = tempList[i + 1];
                    tempList[i + 1] = tempSong;
                    bubbleSorted = false;
                }

            }
        } while (!bubbleSorted);
        if (tempList.length <= 10) {
            for (int i = 0; i < tempList.length; i++) {
                Song tempSong = tempList[i];
                System.out.println(i + 1 + "." + tempSong.getSongTitle() + " by " + tempSong.getArtistName() + "|"
                        + tempSong.getYearOfRelease() + "|" + tempSong.getNumOfPlays() + "|"
                        + tempSong.getLengthMinute()
                        + ":" + tempSong.getLengthSecond());
            }
        } else {
            for (int i = 0; i < 10; i++) {
                Song tempSong = tempList[i];
                System.out.println(i + "." + tempSong.getSongTitle() + " by " + tempSong.getArtistName() + "|"
                        + tempSong.getYearOfRelease() + "|" + tempSong.getNumOfPlays() + "|"
                        + tempSong.getLengthMinute()
                        + ":" + tempSong.getLengthSecond());

            }
        }

        System.out.println("------------------------------------------");
        startMenu();
    }

    /*
     * Prints songs that were released from a year
     */
    private static void printSongsFromAYear() {
        System.out.println("------------------------------------------");
        System.out.println("Printing songs from a certain year");
        System.out.println(" Enter the year");
        int tempYear;
        do {
            try {
                tempYear = InputReader.getInt("  >");
                break;
            } catch (InputMismatchException e) {
            }
        } while (true);
        System.out.println();
        for (int i = 0; i < songList.size(); i++) {
            Song tempSong = songList.get(i);
            if (tempSong.getYearOfRelease() == tempYear) {
                System.out.println(tempSong.getSongTitle() + " by " + tempSong.getArtistName() + "|"
                        + tempSong.getYearOfRelease() + "|" + tempSong.getNumOfPlays() + "|"
                        + tempSong.getLengthMinute()
                        + ":" + tempSong.getLengthSecond());
            }
        }

        System.out.println("------------------------------------------");
        startMenu();
    }

    /*
     * Adds songs to list.
     */
    private static void addSong() {
        System.out.println("------------------------------------------");
        System.out.println("Add song: \n");
        System.out.println(" Please enter the name of the song");
        String songTitle = InputReader.getString("  >");
        System.out.println(" Please enter the artist(s) of the song");
        String artistName = InputReader.getString("  >");
        System.out.println(" Please enter the number of plays it has");
        // This will check if the input for number of plays is an integer, and prevents
        // program from crashing if it isn't
        int nOfPlays;
        do {
            try {
                nOfPlays = InputReader.getInt("  >");
                break;
            } catch (InputMismatchException e) {
            }
        } while (true);
        System.out.println(" Please enter the year of release");
        int yearOfRelease;
        /*
         * This will check if the input for year is an integer, and prevents
         * program from crashing if it isn't
         */
        do {
            try {
                yearOfRelease = InputReader.getInt("  >");
                break;
            } catch (InputMismatchException e) {
            }
        } while (true);
        System.out.println(" Please enter the number of minutes in the song");
        /*
         * This will check if the input for the number of minutes is an integer,
         * and prevents program from crashing if it isn't
         */
        int lengthMinute;
        do {
            try {
                lengthMinute = InputReader.getInt("  >");
                break;
            } catch (InputMismatchException e) {
            }
        } while (true);
        System.out.println(" Please enter the number of seconds in the song");
        /*
         * This will check if the input for the number of seconds is an integer and
         * under 60 seconds,
         * and prevents program from crashing if it isn't
         */
        int lengthSecond;
        boolean under60Checker = false;
        do {

            do {
                try {
                    lengthSecond = InputReader.getInt(" >");
                    break;
                } catch (InputMismatchException e) {
                }
            } while (true);

            if (lengthSecond < 60) {
                under60Checker = true;
            } else {
                System.out.println("Seconds must be under 60");
            }
        } while (!under60Checker);
        System.out.println("");
        System.out.println(" Are you sure this is right?");
        String sureChecker;
        do {
            sureChecker = InputReader.getString("  >");
            if (sureChecker.contains("yes")) {
                Song song = new Song(songTitle, artistName, nOfPlays, yearOfRelease, lengthMinute, lengthSecond);
                songList.add(song);
                System.out.println(" Added song");
                break;
            } else if (sureChecker.contains("no")) {
                addSong();
                break;
            } else {
                System.out.println("Invalid response");
            }
        } while (true);
        System.out.println("------------------------------------------");
        startMenu();
    }

    /*
     * Remove certain song from list.
     */
    private static void deleteSong() {
        System.out.println("------------------------------------------");
        System.out.println("Deleting a song");
        // First checks of list is empty
        if (isEmpty()) {
            System.out.println(" There is nothing to remove");
        } else {
            System.out.println(" Enter the name of the song you want to remove");
            String tempSongName = InputReader.getString("  >");
            int indexOfSong = findByTitle(tempSongName);
            if (indexOfSong == -1) {
                System.out.println(" Song not found");
                startMenu();
            } else {
                System.out.println(" Are you sure?");
                boolean sure = true;
                do {
                    String sureChecker = InputReader.getString("  >");
                    if (sureChecker.contains("yes")) {
                        songList.remove(indexOfSong);
                        System.out.println(" Removed song");
                        sure = false;
                    } else if (sureChecker.contains("no")) {
                        sure = false;
                    } else {
                        System.out.println("Invalid response");
                    }
                } while (sure);
                System.out.println("------------------------------------------");
                startMenu();
            }
        }
    }

    private static int findByTitle(String tempSongName) {
        for (int i = 0; i < songList.size(); i++) {
            Song tempSong = (songList.get(i));
            if (tempSong.getSongTitle().equalsIgnoreCase(tempSongName)) {
                return i;
            }

        }
        return -1;
    }

    // Checks if the list is empty, for deletion method
    private static boolean isEmpty() {
        if (songList.size() == 0) {
            return true;
        }
        return false;
    }

    /*
     * Prints all songs in list.
     */
    private static void printSongs() {
        System.out.println("------------------------------------------");
        System.out.println("Printing all songs");
        System.out.println();
        for (int i = 0; i < songList.size(); i++) {
            Song tempSong = songList.get(i);
            System.out.println(tempSong.getSongTitle() + " by " + tempSong.getArtistName() + "|"
                    + tempSong.getYearOfRelease() + "|" + tempSong.getNumOfPlays() + "|" + tempSong.getLengthMinute()
                    + ":" + tempSong.getLengthSecond());
        }
        System.out.println("------------------------------------------");
        startMenu();
    }

    /*
     * Prints songs that have over a certain number of plays
     */
    private static void printSongsOverNoPlays() {
        System.out.println("------------------------------------------");
        System.out.println("Printing over a certain number of plays");
        System.out.println(" Enter minimum number of plays");
        int minNumOfPlays;
        do {
            try {
                minNumOfPlays = InputReader.getInt("  >");
                break;
            } catch (InputMismatchException e) {
            }
        } while (true);
        System.out.println();
        for (int i = 0; i < songList.size(); i++) {
            Song tempSong = songList.get(i);
            if (tempSong.getNumOfPlays() > minNumOfPlays) {
                System.out.println(tempSong.getSongTitle() + " by " + tempSong.getArtistName() + "|"
                        + tempSong.getYearOfRelease() + "|" + tempSong.getNumOfPlays() + "|"
                        + tempSong.getLengthMinute()
                        + ":" + tempSong.getLengthSecond());
            }
        }

        System.out.println("------------------------------------------");
        startMenu();
    }

    /*
     * Exits the program
     */
    private static void exit() {
        System.exit(0);
    }
}
