package pl.pg.asobecki.wai.spring.logic.services;

import org.springframework.stereotype.Service;
import pl.pg.asobecki.wai.spring.model.dtos.StudentDTO;

import java.util.List;

@Service
public interface StudentRepositoryService {
    void updateStudent(Long id, StudentDTO dto);
    void saveNewStudent(StudentDTO dto);

    List<StudentDTO> findAllOrdered();
}
