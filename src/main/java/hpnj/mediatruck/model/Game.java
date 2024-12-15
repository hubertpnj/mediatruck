package hpnj.mediatruck.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Game extends Media {

    @ManyToMany
    @JoinTable(
            name = "game_platforms",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "platform_id")
    )
    private Set<GamePlatform> platforms;

    public Set<GamePlatform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(Set<GamePlatform> platforms) {
        this.platforms = platforms;
    }
}
