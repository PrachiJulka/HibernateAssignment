package Execution;

import domains.Address;
import domains.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Execute {


    public static void main(String[] args) {

        Author author=new Author();
        Address address=new Address();
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        String date1 = "12-08-1993";
        try {
            Date dateOne = format.parse(date1);
            author.setDob(dateOne);
        }
        catch(Exception e){
            e.printStackTrace();
        }
       address.setLocation("Pitampura");
        address.setState("New Delhi");
        address.setStreetNumber(802);

        author.setAge(24);
        author.setFirstName("Prachi");
        author.setLastName("Julka");
        author.setAddress(address);
       /* Q-4
        Author author1=new Author();
        Author author2=new Author();
        Author author3=new Author();

        String date2 = "21-01-1992";
        String date3="25-05-1995";
        String date4="12-09-2015";

        try{
            Date dateOne = format.parse(date1);
            Date dateTwo = format.parse(date2);
            Date dateThree = format.parse(date3);
            Date dateFour = format.parse(date4);
            author1.setDob(dateTwo);
            author2.setDob(dateThree);
            author3.setDob(dateFour);
         }
        catch(Exception e){
            e.printStackTrace();
        }


        author1.setAge(26);
        author1.setFirstName("Manhar");
        author1.setLastName("Gupta");

        author2.setAge(22);
        author2.setFirstName("Chunky");
        author2.setLastName("Gupta");

        author3.setAge(1);
        author3.setFirstName("Rachel");
        author3.setLastName("Green");

       session.save(author1);
        session.save(author2);
        session.save(author3);
*/
       /* Author author1=(Author)session.get(Author.class,1);
        author1.setAge(24);
*/
        /*Update*///session.update(author1);

        //READ
       /* System.out.println("READ OPERATION");
        System.out.print(author1.getAuthorId()+" ");
        System.out.print(author1.getFirstName()+" ");
        System.out.print(author1.getLastName()+" ");
        System.out.println(author1.getAge());
*/
        //DELETE
  /*      session.delete(author1);
  */
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
