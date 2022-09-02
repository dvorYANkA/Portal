package students.portal.demo.services.map;

import org.springframework.stereotype.Service;
import students.portal.demo.model.Teacher;
import students.portal.demo.services.interfaces.CrudService;

import java.util.Set;

@Service
public class TeacherServiceMap extends AbstractMapService<Teacher, Long> implements CrudService<Teacher,Long> {

    @Override
    public Set<Teacher> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Teacher object) {
        super.delete(object);
    }

    @Override
    public Teacher findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Teacher save(Teacher object) {
        return super.save(object);
    }
}
