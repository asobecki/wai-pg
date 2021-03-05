package pl.pg.asobecki.wai.spring.model.dtos;

public class StudentDTO {
    private String name;
    private String surname;
    private Integer albumNr;
    private String password;

    public StudentDTO() {
    }

    public StudentDTO(String name, String surname, Integer albumNr, String password) {
        this.name = name;
        this.surname = surname;
        this.albumNr = albumNr;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAlbumNr() {
        return albumNr;
    }

    public void setAlbumNr(Integer albumNr) {
        this.albumNr = albumNr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", albumNr=" + albumNr +
                ", password='" + password + '\'' +
                '}';
    }
}
