package Execution;

import domains.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Execute {


    public static void main(String[] args) {

        Author author=new Author();
        author.setAge(20);
        author.setFirstName("Prachi");
        author.setLastName("Julka");

        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
