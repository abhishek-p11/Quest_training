package com.quest.Phase2Test;

import java.util.*;

public class User {
    private String username;
    private Map<String, Playlist> playlists;
    public Set<Track> favoriteTracks;

    public User(String username) {
        this.username = username;
        this.playlists = new HashMap<>();
        this.favoriteTracks = new HashSet<>();
    }

    public void createPlaylist(String name) {
        if (playlists.containsKey(name)) {
            System.out.println("Playlist with this name already exists.");
        } else {
            playlists.put(name, new Playlist(name));
            System.out.println("Playlist created: " + name);
        }
    }

    public void deletePlaylist(String name) {
        if (playlists.remove(name) != null) {
            System.out.println("Playlist deleted: " + name);
        } else {
            System.out.println("Playlist not found.");
        }
    }

    public Playlist getPlaylist(String name) {
        return playlists.get(name);
    }

    public void displayPlaylists() {
        if (playlists.isEmpty()) {
            System.out.println("No playlists created yet.");
        } else {
            playlists.forEach((name, playlist) -> {
                System.out.println("Playlist: " + name);
                playlist.displayTracks();
            });
        }
    }

    public void markAsFavorite(Track track) {
        favoriteTracks.add(track);
        System.out.println("Track marked as favorite.");
    }

    public void unmarkFavorite(Track track) {
        if (favoriteTracks.remove(track)) {
            System.out.println("Track removed from favorites.");
        } else {
            System.out.println("Track is not in the favorites list.");
        }
    }

    public void displayFavoriteTracks() {
        if (favoriteTracks.isEmpty()) {
            System.out.println("No favorite tracks.");
        } else {
            favoriteTracks.forEach(System.out::println);
        }
    }

    public void mergePlaylists(String playlist1Name, String playlist2Name, String newPlaylistName) {
        Playlist playlist1 = playlists.get(playlist1Name);
        Playlist playlist2 = playlists.get(playlist2Name);

        if (playlist1 == null || playlist2 == null) {
            System.out.println("One or both playlists do not exist.");
            return;
        }

        Playlist newPlaylist = new Playlist(newPlaylistName);
        Set<Track> uniqueTracks = new HashSet<>(playlist1.getTracks());
        uniqueTracks.addAll(playlist2.getTracks());

        for (Track track : uniqueTracks) {
            try {
                newPlaylist.addTrack(track);
            } catch (DuplicateTrackException e) {

            }
        }

        playlists.put(newPlaylistName, newPlaylist);
        System.out.println("Playlists merged into: " + newPlaylistName);
    }
}
