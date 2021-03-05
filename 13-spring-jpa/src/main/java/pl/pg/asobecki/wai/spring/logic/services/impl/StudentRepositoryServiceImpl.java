package pl.pg.asobecki.wai.spring.logic.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pg.asobecki.wai.spring.logic.services.StudentRepositoryService;
import pl.pg.asobecki.wai.spring.model.dtos.StudentDTO;
import pl.pg.asobecki.wai.spring.model.repositories.StudentRepository;

@Component
public class StudentRepositoryServiceImpl implements StudentRepositoryService {

    private StudentRepository studentRepository;

    @Override
    public void updateStudent(Long id, StudentDTO dto) {

    }

    @Override
    public void saveNewStudent(StudentDTO dto) {

    }

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
