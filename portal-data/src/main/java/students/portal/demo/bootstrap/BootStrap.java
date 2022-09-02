package students.portal.demo.bootstrap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import students.portal.demo.model.Form;
import students.portal.demo.model.Student;
import students.portal.demo.model.GeneralTask;
import students.portal.demo.model.Teacher;
import students.portal.demo.repository.FormRepository;
import students.portal.demo.repository.TaskRepository;
import students.portal.demo.repository.StudentRepository;
import students.portal.demo.repository.TeacherRepository;

@Component
public class BootStrap implements CommandLineRunner {

    private final StudentRepository studentRepository;
    private final TaskRepository taskRepository;
    private final FormRepository formRepository;
    private final TeacherRepository teacherRepository;

    public BootStrap(StudentRepository studentRepository,
                     TaskRepository taskRepository,
                     FormRepository formRepository,
                     TeacherRepository teacherRepository) {
        this.studentRepository = studentRepository;
        this.taskRepository = taskRepository;
        this.formRepository = formRepository;
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in bootstrap");

        Form form = new Form(true);
        formRepository.save(form);

        GeneralTask taskGeneral1 = new GeneralTask("descriptionOfTask1", "someTitle1", form);
        GeneralTask taskGeneral2 = new GeneralTask("descriptionOfTask2", "someTitle2", form);
        GeneralTask taskGeneral3 = new GeneralTask("descriptionOfTask3", "someTitle3", form);

        taskRepository.save(taskGeneral1);
        taskRepository.save(taskGeneral2);
        taskRepository.save(taskGeneral3);

        Student student1 = new Student("Ann", "Samoylova");
        Student student2 = new Student("Artem", "Bazilev");
        Student student3 = new Student("Artem", "SecondName2");
        Student student4 = new Student("Illia", "SecondName3");
        Student student5 = new Student("Ruslan", "SecondName4");
        Student student6 = new Student("Daria", "SecondName5");
        Student student7 = new Student("Maxim", "Petrenko");
        Student student8 = new Student("Maxim", "SecondName7");
        Student student9 = new Student("New girl", "New girl");
        Student student10 = new Student("Kate", "Tolmacheva");
        Student student11 = new Student("Sonya", "SecondName8");
        Student student12 = new Student("Eva", "SecondName9");

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);
        studentRepository.save(student4);
        studentRepository.save(student5);
        studentRepository.save(student6);
        studentRepository.save(student7);
        studentRepository.save(student8);
        studentRepository.save(student9);
        studentRepository.save(student10);
        studentRepository.save(student11);
        studentRepository.save(student12);

        Teacher teacher1 = new Teacher("Yana", "Tereshchenko");
        Teacher teacher2 = new Teacher("Alice", "Kuznetsova");
        Teacher teacher3 = new Teacher("SmbElse", "SoLazyToday");

        teacherRepository.save(teacher1);
        teacherRepository.save(teacher2);
        teacherRepository.save(teacher3);

        System.out.println("Forms " + formRepository.count());
        System.out.println("Tasks " + taskRepository.count());
        System.out.println("Teachers " + teacherRepository.count());
    }
}
