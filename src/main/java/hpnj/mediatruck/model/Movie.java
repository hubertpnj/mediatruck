package hpnj.mediatruck.model;

import jakarta.persistence.*;

@Entity
public class Movie extends Media {

    @Column(name = "minutes")
    private Integer minutes;

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

}
