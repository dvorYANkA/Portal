package students.portal.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ConcreteTask extends GeneralTask
{
    @ManyToOne
    private Student studentOwner;
    private boolean isDone;

    public ConcreteTask(Student studentOwner, boolean isDone) {
        this.studentOwner = studentOwner;
        this.isDone = isDone;
    }

    public ConcreteTask(String description, String title, Form taskForm, Student studentOwner, boolean isDone) {
        super(description, title, taskForm);
        this.studentOwner = studentOwner;
        this.isDone = isDone;
    }
}
