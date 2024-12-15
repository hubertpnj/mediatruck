package hpnj.mediatruck.model;

import jakarta.persistence.*;

@Entity
public class Episode extends Media {

    @Column(nullable = false)
    private Integer episodeNumber;

    @Column(nullable = false)
    private Integer minutes;

    @ManyToOne
    @JoinColumn(name = "season_id", nullable = false)
    private Season season;

    public Integer getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(Integer episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
