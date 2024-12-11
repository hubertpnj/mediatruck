package hpnj.mediatruck.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "book_series")
public class BookSeries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "bookSeries", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;

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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}