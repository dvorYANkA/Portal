package students.portal.demo.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String description;

    private String title;
    @ManyToOne
    private Form taskForm;

    @ManyToMany
    @JoinTable(name = "student_task", joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private Set<Student> listOfStudents = new HashSet<>();

    public Task(String description, String title, Form taskForm) {
        this.description = description;
        this.title = title;
        this.taskForm = taskForm;
    }

    public Task(String description, String title, Form taskForm, Set<Student> listOfStudents) {
        this.description = description;
        this.title = title;
        this.taskForm = taskForm;
        this.listOfStudents = listOfStudents;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        return id == task.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
