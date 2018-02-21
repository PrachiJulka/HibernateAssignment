package Execution;

import domains.Address;
import domains.Author;
import domains.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Execute {


    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        String date1 = "12-08-1993";
        Book book=new Book();
        book.setBookName("RS Aggarwal");

        Address address=new Address();
        address.setLocation("Pitampura");
        address.setState("New Delhi");
        address.setStreetNumber(802);


        Author author=new Author();
       /* Author author1=new Author();
        Author author2=new Author();
        Author author3=new Author();

        Address address1=new Address();
        address1.setLocation("pulbhangash");
        address1.setState("New Delhi");
        address1.setStreetNumber(801);

        Address address2=new Address();
        address2.setLocation("Rohini");
        address2.setState("New Delhi");
        address2.setStreetNumber(60);

        Address address3=new Address();
        address3.setLocation("Rithala");
        address3.setState("New Delhi");
        address3.setStreetNumber(62);

        String date2 = "21-01-1992";
        String date3="25-05-1995";
        String date4="12-09-2015";*/

        try{
            Date dateOne = format.parse(date1);
            /*Date dateTwo = format.parse(date2);
            Date dateThree = format.parse(date3);
            Date dateFour = format.parse(date4);
            */author.setDob(dateOne);
            /*author1.setDob(dateTwo);
            author2.setDob(dateThree);
            author3.setDob(dateFour);*/
         }
        catch(Exception e){
            e.printStackTrace();
        }

        author.setSubjects(Arrays.asList("Hindi","English","Science","Maths"));
        author.setAge(24);
        author.setFirstName("Prachi");
        author.setLastName("Julka");
        author.setAddress(address);
        author.setBook(book);

      /*  author1.setAge(26);
        author1.setFirstName("Manhar");
        author1.setLastName("Gupta");
        author1.setSubjects(Arrays.asList("Hindi","English","Science","Maths"));
        author1.setAddress(address1);

        author2.setAge(22);
        author2.setFirstName("Chunky");
        author2.setLastName("Gupta");
        author2.setSubjects(Arrays.asList("Hindi","English","Science","Maths"));
        author2.setAddress(address2);

        author3.setAge(1);
        author3.setFirstName("Rachel");
        author3.setLastName("Green");
        author3.setSubjects(Arrays.asList("Hindi","English","Science","Maths"));
        author3.setAddress(address3);*/

        /*Author author1=(Author)session.get(Author.class,1);
        author1.setAge(24);
        Update//session.update(author1);

        //READ
        System.out.println("READ OPERATION");
        System.out.print(author1.getAuthorId()+" ");
        System.out.print(author1.getFirstName()+" ");
        System.out.print(author1.getLastName()+" ");
        System.out.println(author1.getAge());
        //DELETE
        session.delete(author1);
        */
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);
        session.save(book);
       /* session.save(author1);
        session.save(author2);
        session.save(author3);*/
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
