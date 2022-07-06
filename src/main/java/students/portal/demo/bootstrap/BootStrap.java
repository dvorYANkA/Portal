package students.portal.demo.bootstrap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import students.portal.demo.model.Form;
import students.portal.demo.model.Task;
import students.portal.demo.model.User;
import students.portal.demo.repository.FormRepository;
import students.portal.demo.repository.TaskRepository;
import students.portal.demo.repository.UserRepository;

import java.awt.print.Book;
import java.util.Set;

@Component
public class BootStrap implements CommandLineRunner {

    private final UserRepository userRepository;
    private final TaskRepository taskRepository;
    private final FormRepository formRepository;

    public BootStrap(UserRepository userRepository,
                     TaskRepository taskRepository,
                     FormRepository formRepository) {
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
        this.formRepository = formRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in bootstrap");

        Form form = new Form(true);
        formRepository.save(form);
        Task task = new Task("descriptionOfTask", "someTitle", form);
        taskRepository.save(task);/*
        User user = new User("firstName","lastName", (Set<Task>) taskRepository);
        userRepository.save(user);

        System.out.println("Users " + userRepository.count());*/
        System.out.println("Forms " + formRepository.count());
        System.out.println("Tasks " + taskRepository.count());
    }
}
