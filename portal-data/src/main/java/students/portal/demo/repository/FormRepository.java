package students.portal.demo.repository;
import students.portal.demo.model.Form;
import org.springframework.data.repository.CrudRepository;

public interface FormRepository extends CrudRepository<Form, Long> {
}
