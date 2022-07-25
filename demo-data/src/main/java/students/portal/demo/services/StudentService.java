package students.portal.demo.services;
import students.portal.demo.model.Student;
import java.util.Set;

public interface StudentService extends CrudService<Student, Long>
{
    Student findByLastName(String lastName);
}
