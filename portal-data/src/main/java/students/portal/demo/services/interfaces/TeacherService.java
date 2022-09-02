package students.portal.demo.services.interfaces;

import students.portal.demo.model.Teacher;
import students.portal.demo.services.interfaces.CrudService;

public interface TeacherService extends CrudService<Teacher, Long>
{
    Teacher findByLastName(String lastName);
}
