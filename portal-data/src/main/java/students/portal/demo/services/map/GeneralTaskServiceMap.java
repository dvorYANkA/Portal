package students.portal.demo.services.map;

import org.springframework.stereotype.Service;
import students.portal.demo.model.GeneralTask;
import students.portal.demo.services.interfaces.CrudService;

import java.util.Set;

@Service
public class GeneralTaskServiceMap extends AbstractMapService<GeneralTask, Long> implements CrudService<GeneralTask, Long> {
    @Override
    public Set<GeneralTask> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(GeneralTask object) {
        super.delete(object);
    }

    @Override
    public GeneralTask findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public GeneralTask save(GeneralTask object) {
        return super.save(object);
    }
}
