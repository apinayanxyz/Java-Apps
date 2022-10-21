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

public class Main {
    /*
     * This method will start the menu that the user will use.
     */

    ArrayList<Songs> songList = new ArrayList<Songs>();

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
        addSong();
        deleteSong();
        printSongs();
        printSongsOverNoPlays();
        exit();
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
