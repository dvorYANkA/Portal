package students.portal.demo.repository;
import org.springframework.data.repository.CrudRepository;
import students.portal.demo.model.Form;

public interface FormRepository extends CrudRepository<Form, Long> {
}
