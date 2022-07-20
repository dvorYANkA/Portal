package students.portal.demo.repository;
import students.portal.demo.model.TaskGeneral;
import org.springframework.data.repository.CrudRepository;


public interface TaskRepository extends CrudRepository<TaskGeneral, Long> {
}
