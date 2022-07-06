package students.portal.demo.model;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Form {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;

    @OneToMany
    @JoinColumn(name = "Form_id")
    private Set<Task> listOfTasks = new HashSet<>();

    private boolean algOrGeom;

    public Form(boolean algOrGeom) {
        this.algOrGeom = algOrGeom;
    }

    public Form(Set<Task> listOfTasks, boolean algOrGeom) {
        this.listOfTasks = listOfTasks;
        this.algOrGeom = algOrGeom;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", listOfTasks=" + listOfTasks +
                ", algOrGeom=" + algOrGeom +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Form form = (Form) o;

        return id == form.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
