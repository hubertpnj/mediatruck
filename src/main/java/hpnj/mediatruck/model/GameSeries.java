package hpnj.mediatruck.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "game_series")
public class GameSeries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "gameSeries", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Game> games;

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

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}