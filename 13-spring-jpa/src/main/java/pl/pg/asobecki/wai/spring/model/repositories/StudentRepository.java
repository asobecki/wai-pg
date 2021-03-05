package pl.pg.asobecki.wai.spring.model.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.pg.asobecki.wai.spring.model.entities.StudentEntity;

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
