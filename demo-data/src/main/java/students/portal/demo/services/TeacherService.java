package students.portal.demo.services;

import students.portal.demo.model.Teacher;

import java.util.Set;

public interface TeacherService
{
    Teacher findByLastName(String lastName);
    Teacher findById(Long id);
    Teacher save(Teacher teacher);
    Set<Teacher> findAll();
}
