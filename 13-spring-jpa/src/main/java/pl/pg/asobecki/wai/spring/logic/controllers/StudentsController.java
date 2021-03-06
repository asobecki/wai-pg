package pl.pg.asobecki.wai.spring.logic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.pg.asobecki.wai.spring.logic.services.StudentRepositoryService;
import pl.pg.asobecki.wai.spring.model.dtos.StudentDTO;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentsController {

    private StudentRepositoryService studentRepositoryService;

    @RequestMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<?> list() {
        List<StudentDTO> students = studentRepositoryService.findAllOrdered();
        return ResponseEntity.ok(students);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addStudent(@Valid @RequestBody StudentDTO dto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().build();
        }

        studentRepositoryService.saveNewStudent(dto);
        return ResponseEntity.ok().build();
    }

    @Autowired
    public void setStudentRepositoryService(StudentRepositoryService studentRepositoryService) {
        this.studentRepositoryService = studentRepositoryService;
    }
}
