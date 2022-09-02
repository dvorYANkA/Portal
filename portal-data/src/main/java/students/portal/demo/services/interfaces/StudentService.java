package students.portal.demo.services.interfaces;
import students.portal.demo.model.Student;
import students.portal.demo.services.interfaces.CrudService;

public interface StudentService extends CrudService<Student, Long>
{
    Student findByLastName(String lastName);
}
