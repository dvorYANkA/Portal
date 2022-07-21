package students.portal.demo.services;

import students.portal.demo.model.ConcreteTask;
import students.portal.demo.model.GeneralTask;
import students.portal.demo.model.Teacher;

import java.util.Set;

public interface ConcreteTaskService {
    ConcreteTask findById(Long id);
    ConcreteTask save(ConcreteTask concreteTask);
    Set<ConcreteTask> findAll();
}
