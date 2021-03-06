package pl.pg.asobecki.wai.spring.logic.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pg.asobecki.wai.spring.logic.services.StudentRepositoryService;
import pl.pg.asobecki.wai.spring.model.dtos.StudentDTO;
import pl.pg.asobecki.wai.spring.model.entities.StudentEntity;
import pl.pg.asobecki.wai.spring.model.repositories.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepositoryServiceImpl implements StudentRepositoryService {

    private StudentRepository studentRepository;

    @Override
    public void updateStudent(Long id, StudentDTO dto) {

    }

    @Override
    public void saveNewStudent(StudentDTO dto) {

    }

    @Override
    public List<StudentDTO> findAllOrdered() {
        List<StudentEntity> students = (List<StudentEntity>) studentRepository.findAll();
        List<StudentDTO> dtos = new ArrayList<>();
        for (StudentEntity s: students) {
            dtos.add(new StudentDTO(s.getName(),s.getSurname(), s.getAlbumNr(), null));
        }
        return dtos;
    }

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
