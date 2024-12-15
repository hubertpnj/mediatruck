package hpnj.mediatruck.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Album extends Media {

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private List<Song> songs;

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}