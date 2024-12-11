package hpnj.mediatruck.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate releaseDate;

    @ElementCollection(targetClass = MediaGenre.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "book_genre", joinColumns = @JoinColumn(name = "book_id"))
    @Column(name = "genre")
    private Set<MediaGenre> genres;

    @ManyToOne(optional = true)
    @JoinColumn(name = "book_series_id")
    private BookSeries bookSeries;

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

    public Set<MediaGenre> getGenres() {
        return genres;
    }

    public void setGenres(Set<MediaGenre> genres) {
        this.genres = genres;
    }

    public BookSeries getBookSeries() {
        return bookSeries;
    }

    public void setBookSeries(BookSeries bookSeries) {
        this.bookSeries = bookSeries;
    }
}