package students.portal.demo.services;
import students.portal.demo.model.GeneralTask;
import students.portal.demo.model.Teacher;
import java.util.Set;

public interface GeneralTaskService
{
    GeneralTask findById(Long id);
    GeneralTask save(GeneralTask generalTask);
    Set<GeneralTask> findAll();
}
