package students.portal.demo.repository;
import org.springframework.data.repository.CrudRepository;
import students.portal.demo.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
