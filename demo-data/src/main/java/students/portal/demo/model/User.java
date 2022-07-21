package students.portal.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User extends BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;

    String firstName = "";
    String lastName = "";
}
