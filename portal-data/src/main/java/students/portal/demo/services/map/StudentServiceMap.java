package students.portal.demo.services.map;

import org.springframework.stereotype.Service;
import students.portal.demo.model.Student;
import students.portal.demo.services.interfaces.CrudService;

import java.util.Set;

@Service
public class StudentServiceMap extends AbstractMapService<Student, Long> implements CrudService<Student, Long> {
    @Override
    public Set<Student> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Student object) {
        super.delete(object);
    }

    @Override
    public Student findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Student save(Student object) {
        return super.save(object);
    }
}
