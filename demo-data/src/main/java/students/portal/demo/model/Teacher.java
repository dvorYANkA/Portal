package students.portal.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Teacher implements User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    String lastName;
    String firstName;

    @OneToMany
    @JoinColumn(name = "Teacher_id")
    Set<Student> listOfStudent = new HashSet<>();

    //TODO: link to list of subject + create Subject object;
}
