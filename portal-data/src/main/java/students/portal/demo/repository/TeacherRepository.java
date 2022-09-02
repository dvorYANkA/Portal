package students.portal.demo.repository;

import org.springframework.data.repository.CrudRepository;
import students.portal.demo.model.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {

}
