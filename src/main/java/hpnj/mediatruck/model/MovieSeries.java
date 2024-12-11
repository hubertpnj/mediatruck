package hpnj.mediatruck.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "movie_series")
public class MovieSeries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "movieSeries", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

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
}