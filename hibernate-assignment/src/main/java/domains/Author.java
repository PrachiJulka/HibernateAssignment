package domains;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Author {
//Q-9
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy =GenerationType.TABLE)
    @Column(name="Author_ID")
    Integer authorId;
    @Column(name="FirstName")
    String firstName;

    @Transient
    @Column(name="LastName")
    String lastName;

    @Column(name="Age")
    Integer age;

    @Embedded
    Address address;

    @ElementCollection
    List<String> subjects=new ArrayList<>();


    @Temporal(TemporalType.DATE)
    @Column(name="DateOfBirth")
    Date dob;
//Bidirectional
    @ManyToMany(cascade = CascadeType.PERSIST)
     List<Book> book=new ArrayList<>();

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }



    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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
