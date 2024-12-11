package hpnj.mediatruck.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate releaseDate;

    @Column(nullable = false)
    private int length;

    @ElementCollection(targetClass = MediaGenre.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "movie_genre", joinColumns = @JoinColumn(name = "movie_id"))
    @Column(name = "genre")
    private Set<MediaGenre> genres;

    @ManyToOne(optional = true)
    @JoinColumn(name = "movie_series_id")
    private MovieSeries movieSeries;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
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

    public MovieSeries getMovieSeries() {
        return movieSeries;
    }

    public void setMovieSeries(MovieSeries movieSeries) {
        this.movieSeries = movieSeries;
    }
}