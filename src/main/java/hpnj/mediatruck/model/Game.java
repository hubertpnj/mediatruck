package hpnj.mediatruck.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate releaseDate;

    @ElementCollection(targetClass = Platform.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "game_platform", joinColumns = @JoinColumn(name = "game_id"))
    @Column(name = "platform")
    private Set<Platform> platforms;

    @ElementCollection(targetClass = MediaGenre.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "game_genre", joinColumns = @JoinColumn(name = "game_id"))
    @Column(name = "genre")
    private Set<MediaGenre> genres;

    @ManyToOne(optional = true)
    @JoinColumn(name = "game_series_id")
    private GameSeries gameSeries;

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

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Set<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(Set<Platform> platforms) {
        this.platforms = platforms;
    }

    public Set<MediaGenre> getGenres() {
        return genres;
    }

    public void setGenres(Set<MediaGenre> genres) {
        this.genres = genres;
    }

    public GameSeries getGameSeries() {
        return gameSeries;
    }

    public void setGameSeries(GameSeries gameSeries) {
        this.gameSeries = gameSeries;
    }
}