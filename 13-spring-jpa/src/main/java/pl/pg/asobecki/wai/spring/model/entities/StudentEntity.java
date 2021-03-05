package pl.pg.asobecki.wai.spring.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by asobecki on 01.04.2017.
 */
@Entity
public class StudentEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private Integer albumNr;
    private String password;


    // only for JPA
    protected StudentEntity() {

    }

    public StudentEntity(String name, String surname, Integer albumNr) {
        this.name = name;
        this.surname = surname;
        this.albumNr = albumNr;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", albumNr=" + albumNr +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAlbumNr() {
        return albumNr;
    }
}
