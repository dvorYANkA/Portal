package students.portal.demo.bootstrap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import students.portal.demo.model.Form;
import students.portal.demo.model.Task;
import students.portal.demo.repository.FormRepository;
import students.portal.demo.repository.TaskRepository;
import students.portal.demo.repository.StudentRepository;

@Component
public class BootStrap implements CommandLineRunner {

    private final StudentRepository studentRepository;
    private final TaskRepository taskRepository;
    private final FormRepository formRepository;

    public BootStrap(StudentRepository studentRepository,
                     TaskRepository taskRepository,
                     FormRepository formRepository) {
        this.studentRepository = studentRepository;
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
