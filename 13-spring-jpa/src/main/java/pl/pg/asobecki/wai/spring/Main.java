package pl.pg.asobecki.wai.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @Bean
    public CommandLineRunner jpaDemo(StudentRepository repository) {
        return (args) -> {
            repository.save(new StudentEntity("Jan", "Kowalski", 100));
            repository.save(new StudentEntity("Adam", "Nowak", 101));
            repository.save(new StudentEntity("Stefan", "Kludi", 102));
            repository.save(new StudentEntity("Grzegorz", "Boniek", 103));

            log.info("All students: ");
            for(StudentEntity studentEntity : repository.findAll()) {
                log.info(studentEntity.toString());
            }

            log.info("Student with id 1");
            log.info(repository.findOne(1L).toString());

            //over-posting
            StudentEntity x = repository.findOne(1L);
            // wysylamy go na formularz update
            repository.save(x);
            // submit -> repsotiry ()
            // DTO -> Data-Transfer-Object
            // ograniczone entities to tego co idzie na formularz
            // User -> DTO -> Entity -> DB

            log.info("Student with album number 103");
            log.info(repository.getStudentsByAlbumNr(103).toString());
        };
    }
}
