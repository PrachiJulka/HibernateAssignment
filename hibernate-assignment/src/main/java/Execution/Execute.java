package Execution;

import domains.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Execute {


    public static void main(String[] args) {

        Author author=new Author();
        author.setAge(20);
        author.setFirstName("Prachi");
        author.setLastName("Julka");
        author.setDob(new Date());
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);
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
  */      session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
