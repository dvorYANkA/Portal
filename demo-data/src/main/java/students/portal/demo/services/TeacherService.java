package students.portal.demo.services;

import students.portal.demo.model.Teacher;

import java.util.Set;

public interface TeacherService extends CrudService<Teacher, Long>
{
    Teacher findByLastName(String lastName);
}
