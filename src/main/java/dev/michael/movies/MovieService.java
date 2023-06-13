package dev.michael.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//business logic will go here
@Service
public class MovieService {
    @Autowired //lets framework know we want the framework to instantiate the annotated class for us
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll(); //returns list of datatype (Movie)
    }
}
