package hpnj.mediatruck.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@DiscriminatorValue("SONG")
@Table(name = "song")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int length;

    @ElementCollection(targetClass = MediaGenre.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "song_genres", joinColumns = @JoinColumn(name = "song_id"))
    @Column(name = "genre")
    private Set<MediaGenre> genres;

    @ManyToOne(optional = true)
    @JoinColumn(name = "album_id")
    private Album album;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Set<MediaGenre> getGenres() {
        return genres;
    }

    public void setGenres(Set<MediaGenre> genres) {
        this.genres = genres;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}