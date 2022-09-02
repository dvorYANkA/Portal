package students.portal.demo.repository;
import students.portal.demo.model.GeneralTask;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<GeneralTask, Long> {
}
