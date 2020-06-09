package ee.sdaacademy.cinema.repositories;

import ee.sdaacademy.cinema.models.Movie;
import ee.sdaacademy.cinema.utils.HibernateUtils;
import org.hibernate.Session;

import java.util.List;

public class MovieRepository {
    public List <Movie> findAll(){
        Session session = HibernateUtils.openSession();
        List<Movie> movies = session.createQuery("select m from Movie m", Movie.class).getResultList();
        session.close();
        return movies;
    }

}
