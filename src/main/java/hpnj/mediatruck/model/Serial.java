package hpnj.mediatruck.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Serial extends Media {
    @OneToMany(mappedBy = "serial", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Season> seasons;

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }
}