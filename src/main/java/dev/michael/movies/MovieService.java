package dev.michael.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//business logic will go here
@Service
public class MovieService {
    @Autowired //lets framework know we want the framework to instantiate the annotated class for us
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll(); //returns list of datatype (Movie)
    }

    public Optional<Movie> singleMovie(ObjectId id) {
        return movieRepository.findById(id);
    }
}
