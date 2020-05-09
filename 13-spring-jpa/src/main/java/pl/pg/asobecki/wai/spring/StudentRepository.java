package pl.pg.asobecki.wai.spring;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by asobecki on 01.04.2017.
 */
public interface StudentRepository extends CrudRepository<StudentEntity, Long> {

    List<StudentEntity> getStudentsByAlbumNr(Integer albumNr);
    //StudentEntity getStudentById(Long id);
    //List<StudentEntity> findBySurname(String surname);
    //List<StudentEntity> findByName(String name);
}
