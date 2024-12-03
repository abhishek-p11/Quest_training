package com.quest.Phase2Test;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        User user = new User(username);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Playlist");
            System.out.println("2. Delete Playlist");
            System.out.println("3. Add Track to Playlist");
            System.out.println("4. Remove Track from Playlist");
            System.out.println("5. Display Playlists");
            System.out.println("6. Search Track");
            System.out.println("7. Sort Tracks");
            System.out.println("8. Shuffle Tracks");
            System.out.println("9. Merge Playlists");
            System.out.println("10. Rate a Track");
            System.out.println("11. Mark/Unmark Favorite Tracks");
            System.out.println("12. Display Favorite Tracks");
            System.out.println("13. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    user.createPlaylist(playlistName);
                }
                case 2 -> {
                    System.out.print("Enter playlist name to delete: ");
                    String playlistName = scanner.nextLine();
                    user.deletePlaylist(playlistName);
                }
                case 3 -> {
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    Playlist playlist = user.getPlaylist(playlistName);
                    if (playlist != null) {
                        System.out.print("Enter track ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter track title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter artist: ");
                        String artist = scanner.nextLine();
                        System.out.print("Enter duration: ");
                        double duration = scanner.nextDouble();
                        try {
                            playlist.addTrack(new Track(id, title, artist, duration));
                            System.out.println("Track added.");
                        } catch (DuplicateTrackException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Playlist not found.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    Playlist playlist = user.getPlaylist(playlistName);
                    if (playlist != null) {
                        System.out.print("Enter track ID to remove: ");
                        int id = scanner.nextInt();
                        playlist.removeTrack(id);
                        System.out.println("Track removed.");
                    } else {
                        System.out.println("Playlist not found.");
                    }
                }
                case 5 -> user.displayPlaylists();
                case 6 -> {
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    Playlist playlist = user.getPlaylist(playlistName);
                    if (playlist != null) {
                        System.out.print("Enter keyword to search: ");
                        String keyword = scanner.nextLine();
                        List<Track> results = playlist.searchTrack(keyword);
                        if (results.isEmpty()) {
                            System.out.println("No tracks found.");
                        } else {
                            results.forEach(System.out::println);
                        }
                    } else {
                        System.out.println("Playlist not found.");
                    }
                }
                case 7 -> {
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    Playlist playlist = user.getPlaylist(playlistName);
                    if (playlist != null) {
                        System.out.println("1. Sort by duration");
                        System.out.println("2. Sort by title");
                        System.out.println("3. Sort by rating");
                        System.out.print("Choose an option: ");
                        int sortChoice = scanner.nextInt();
                        switch (sortChoice) {
                            case 1 -> playlist.sortByDuration();
                            case 2 -> playlist.sortByTitle();
                            case 3 -> playlist.sortByRating();
                            default -> System.out.println("Invalid choice.");
                        }
                        System.out.println("Sorted tracks:");
                        playlist.displayTracks();
                    } else {
                        System.out.println("Playlist not found.");
                    }
                }
                case 8 -> {
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    Playlist playlist = user.getPlaylist(playlistName);
                    if (playlist != null) {
                        playlist.shuffle();
                        System.out.println("Tracks shuffled:");
                        playlist.displayTracks();
                    } else {
                        System.out.println("Playlist not found.");
                    }
                }
                case 9 -> {
                    System.out.print("Enter first playlist name: ");
                    String playlist1Name = scanner.nextLine();
                    System.out.print("Enter second playlist name: ");
                    String playlist2Name = scanner.nextLine();
                    System.out.print("Enter new playlist name: ");
                    String newPlaylistName = scanner.nextLine();
                    user.mergePlaylists(playlist1Name, playlist2Name, newPlaylistName);
                }
                case 10 -> {
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    Playlist playlist = user.getPlaylist(playlistName);
                    if (playlist != null) {
                        System.out.print("Enter track ID to rate: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter rating (1-5): ");
                        int rating = scanner.nextInt();
                        for (Track track : playlist.getTracks()) {
                            if (track.getId() == id) {
                                try {
                                    track.setRating(rating);
                                    System.out.println("Track rated.");
                                } catch (IllegalArgumentException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            }
                        }
                    } else {
                        System.out.println("Playlist not found.");
                    }
                }
                case 11 -> {
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    Playlist playlist = user.getPlaylist(playlistName);
                    if (playlist != null) {
                        System.out.print("Enter track ID to mark/unmark as favorite: ");
                        int id = scanner.nextInt();
                        for (Track track : playlist.getTracks()) {
                            if (track.getId() == id) {
                                if (user.favoriteTracks.contains(track)) {
                                    user.unmarkFavorite(track);
                                } else {
                                    user.markAsFavorite(track);
                                }
                                break;
                            }
                        }
                    } else {
                        System.out.println("Playlist not found.");
                    }
                }
                case 12 -> user.displayFavoriteTracks();
                case 13 -> {
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
