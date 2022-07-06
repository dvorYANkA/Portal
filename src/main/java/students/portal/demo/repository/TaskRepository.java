package students.portal.demo.repository;
import org.springframework.data.repository.CrudRepository;
import students.portal.demo.model.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
