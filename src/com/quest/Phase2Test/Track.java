package com.quest.Phase2Test;
import java.util.Objects;

public class Track {
    private int id;
    private String title;
    private String artist;
    private double duration;
    private int rating;

    public Track(int id, String title, String artist, double duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.rating = 0; // Default rating
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5.");
        }
        this.rating = rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Track track = (Track) obj;
        return id == track.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Track{" +
                "ID=" + id +
                ", Title='" + title + '\'' +
                ", Artist='" + artist + '\'' +
                ", Duration=" + duration +
                ", Rating=" + rating +
                '}';
    }

}

