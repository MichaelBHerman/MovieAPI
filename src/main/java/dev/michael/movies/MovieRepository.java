package dev.michael.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//data access layer
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {  //let it know what type of data and Id type we are dealing with, i.e. <Movie and ObjectId>
    Optional<Movie> findMovieByImdbId(String imbdId);
}
