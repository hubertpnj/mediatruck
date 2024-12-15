package hpnj.mediatruck.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Season extends Media {

    @Column(nullable = false)
    private int seasonNumber;

    @ManyToOne
    @JoinColumn(name = "serial_id", nullable = false)
    private Serial serial;

    @OneToMany(mappedBy = "season", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Episode> episodes;

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public Serial getSerial() {
        return serial;
    }

    public void setSerial(Serial serial) {
        this.serial = serial;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }
}
