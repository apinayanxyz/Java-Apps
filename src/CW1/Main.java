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

import java.util.ArrayList;

import helpers.InputReader;

public class Main {

    ArrayList<Song> songList = new ArrayList<Song>();

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
        startMenu();
    }

    /*
     * This method will provide the user with the options mentioned above.
     * This menu has been given its own menu to allow for the program to call the
     * menu after a task has been complete.
     */
    private static void startMenu() {
        System.out.println("Main Menu");
        System.out.println("");
        System.out.println(" Please choose 1 from the options below");
        System.out.println("------------------------------------------");
        System.out.println("  1. Add a song");
        System.out.println("  2. Remove a song");
        System.out.println("  3. Print all songs");
        System.out.println("  4. Print all songs over chosen number of plays");
        System.out.println("  5. Exit program");
        System.out.println("------------------------------------------");
        System.out.println("");
        String userInp = InputReader.getString(">");
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
                exit();
                break;
            default:
                System.out.println("Invalid option chosen");
                System.out.println("Please pick from one of the options above");
                startMenu();
        }
    }

    /*
     * Finds a specified song.
     */
    private static void findSong() {
    }

    /*
     * Adds songs to list.
     */
    private static void addSong() {
    }

    /*
     * Remove certain song from list.
     */
    private static void deleteSong() {
    }

    /*
     * Prints all songs in list.
     */
    private static void printSongs() {
    }

    /*
     * Prints songs that have over a certain number of plays
     */
    private static void printSongsOverNoPlays() {
    }

    /*
     * Exits the program
     */
    private static void exit() {
    }
}
