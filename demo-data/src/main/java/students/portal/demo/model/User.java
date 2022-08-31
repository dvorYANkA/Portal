package students.portal.demo.model;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User extends BaseEntity
{
    String firstName = "";
    String lastName = "";

}