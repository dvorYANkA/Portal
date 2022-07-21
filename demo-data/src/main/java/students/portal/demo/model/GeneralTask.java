package students.portal.demo.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GeneralTask {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String description;

    private String title;

    @ManyToOne
    private Form taskForm;

    public GeneralTask(String description, String title, Form taskForm) {
        this.description = description;
        this.title = title;
        this.taskForm = taskForm;
    }

    @Override
    public String toString() {
        return "GeneralTask{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeneralTask generalTask = (GeneralTask) o;

        return id == generalTask.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
