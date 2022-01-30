package sec_8_arays_java_inbuilt_lists_autoboxing_unboxing.linkedlist.playlist_challenge;

import java.util.*;

public class PlayListChallenge {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<Album>();
        Album album = new Album("we malo", "Amr Diab");
        album.addSong("We malo", 3.15);
        album.addSong("2amreen", 4.12);
        album.addSong("el lailady", 3.60);
        album.addSong("b3ed 3ank", 3.15);
        album.addSong("el 7ob kolo", 5.30);
        album.addSong("tamely maak", 4.20);
        album.addSong("enta el 7az", 3.56);

        albums.add(album);
        album = new Album("el saieda el 2ola", "Amr Hasan");
        album.addSong("Wahshtiny 1", 8.30);
        album.addSong("5alena so7ab", 6.40);
        album.addSong("el 7arb el 3alamya", 9.0);
        album.addSong("Hibta", 11.3);
        album.addSong("el frasha", 6.50);
        album.addSong("Ba7r", 7.90);
        album.addSong("Belyat4o", 8.60);
        albums.add(album);


        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("We malo", playList);
        albums.get(0).addToPlayList("Hibta", playList);
        albums.get(0).addToPlayList("b3ed 3ank", playList);
        albums.get(0).addToPlayList(7, playList);
        albums.get(1).addToPlayList(6, playList);
        albums.get(1).addToPlayList(5, playList);
        albums.get(1).addToPlayList(10, playList);
        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No Songs in playlist");
            return;
        } else {
            System.out.println("Now Playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    }
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("Available actions:\npress:");
        System.out.println("0 - to quit\n"
                + "1 - to play next song\n"
                + "2 - to play previous song\n"
                + "3 - to replay the current song\n"
                + "4 - list songs in the playlist\n"
                + "5 - print available actions\n"
                + "6 - delete current song from playlist.");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=======================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=======================================");
    }
}
