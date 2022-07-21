package students.portal.demo.services;
import students.portal.demo.model.Student;
import java.util.Set;

public interface StudentService
{
    Student findByLastName(String lastName);
    Student findById(Long id);
    Student save(Student student);
    Set<Student> findAll();
}
