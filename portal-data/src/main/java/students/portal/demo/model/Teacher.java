package students.portal.demo.model;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class Teacher extends User
{
    String lastName;
    String firstName;

    @OneToMany
    @JoinColumn(name = "Teacher_id")
    Set<Student> listOfStudent = new HashSet<>();

    public Teacher(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //TODO: link to list of subject + create Subject object;
}
