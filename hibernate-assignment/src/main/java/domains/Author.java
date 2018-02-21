package domains;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Author {
//Q-9
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy =GenerationType.TABLE)
    @Column(name="Author_ID")
    Integer authorId;
    @Column(name="FirstName")
    String firstName;

    @Transient
    @Column(name="LastName")
    String lastName;

    @Column(name="Age")
    Integer age;

    @Temporal(TemporalType.DATE)
    @Column(name="DateOfBirth")
    Date dob;

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
