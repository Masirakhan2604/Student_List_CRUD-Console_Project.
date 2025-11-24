package crudproject;

import java.util.Scanner;

public class MainMusicApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MusicPlaylist mp = new MusicPlaylist();

        while (true) {
            System.out.println("\n--- Music Playlist Menu ---");
            System.out.println("1. Add Song");
            System.out.println("2. Play Next");
            System.out.println("3. Play Previous");
            System.out.println("4. Remove Song");
            System.out.println("5. Show Playlist");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter Song Name: ");
                    mp.addSong(sc.nextLine());
                    break;

                case 2:
                    mp.playNext();
                    break;

                case 3:
                    mp.playPrev();
                    break;

                case 4:
                    System.out.print("Enter Song to Remove: ");
                    mp.removeSong(sc.nextLine());
                    break;

                case 5:
                    mp.showPlaylist();
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);
            }
        }
    }
}
