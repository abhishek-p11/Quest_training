package com.quest.Phase2Test;

import java.util.*;

public class Playlist {
    private String name;
    private List<Track> tracks;

    public Playlist(String name) {
        this.name = name;
        this.tracks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTrack(Track track) throws DuplicateTrackException {
        if (tracks.contains(track)) {
            throw new DuplicateTrackException("Track already exists in the playlist.");
        }
        tracks.add(track);
    }

    public void removeTrack(int trackId) {
        tracks.removeIf(track -> track.getId() == trackId);
    }

    public List<Track> searchTrack(String keyword) {
        List<Track> result = new ArrayList<>();
        for (Track track : tracks) {
            if (track.getTitle().equalsIgnoreCase(keyword) || track.getArtist().equalsIgnoreCase(keyword)) {
                result.add(track);
            }
        }
        return result;
    }

    public void displayTracks() {
        if (tracks.isEmpty()) {
            System.out.println("No tracks in the playlist.");
        } else {
            for (Track track : tracks) {
                System.out.println(track);
            }
        }
    }

    public void sortByDuration() {
        tracks.sort(Comparator.comparingDouble(Track::getDuration));
    }

    public void sortByTitle() {
        tracks.sort(Comparator.comparing(Track::getTitle));
    }

    public void sortByRating() {
        tracks.sort((t1, t2) -> Integer.compare(t2.getRating(), t1.getRating())); // Descending order of rating
    }

    public void shuffle() {
        Collections.shuffle(tracks);
    }

    public List<Track> getTracks() {
        return tracks;
    }
}
