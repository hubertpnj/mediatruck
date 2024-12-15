package hpnj.mediatruck.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<MediaAuthorRole> mediaAuthorRoles;

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

    public List<MediaAuthorRole> getMediaAuthorRoles() {
        return mediaAuthorRoles;
    }

    public void setMediaAuthorRoles(List<MediaAuthorRole> mediaAuthorRoles) {
        this.mediaAuthorRoles = mediaAuthorRoles;
    }
}
