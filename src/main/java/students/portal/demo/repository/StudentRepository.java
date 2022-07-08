package students.portal.demo.repository;
import org.springframework.data.repository.CrudRepository;
import students.portal.demo.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
