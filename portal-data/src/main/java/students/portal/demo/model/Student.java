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
public class Student extends User
{
    private String firstName;
    private String lastName;

    @OneToMany
    @JoinColumn(name = "Student_id")
    private Set<ConcreteTask> listOfConcreteTasks = new HashSet<>();

    @ManyToOne
    private Teacher teacher;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, Set<ConcreteTask> listOfConcreteTasks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.listOfConcreteTasks = listOfConcreteTasks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", listOfTasks=" + listOfConcreteTasks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student user = (Student) o;

        return id == user.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
