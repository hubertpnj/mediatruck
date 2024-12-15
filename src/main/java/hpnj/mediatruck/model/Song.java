package hpnj.mediatruck.model;

import jakarta.persistence.*;

@Entity
public class Song extends Media {

    @Column(nullable = false)
    private Integer seconds;

    @ManyToOne
    @JoinColumn(name = "album_id", nullable = true)
    private Album album;

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}