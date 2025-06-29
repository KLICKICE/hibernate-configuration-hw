package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.exception.DataProcessingException;
import mate.academy.model.Movie;

public class MovieServiceImpl implements MovieService {
    @Override
    public Movie add(Movie movie) {
        MovieDao movieDao = new MovieDaoImpl();
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        MovieDao movieDao = new MovieDaoImpl();
        return movieDao.get(id).orElseThrow(()
                -> new DataProcessingException("Movie with id " + id + " not found", null));
    }
}
