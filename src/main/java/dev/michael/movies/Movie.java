package dev.michael.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") //This annotation marks a class as being a domain object that we want to persist to the database: It also allows us to choose the name of the collection we want to use: (collection = "name")


@Data //from lombok, takes care of all getters/setters and toString methods
@AllArgsConstructor //creating constructor that takes all private fields below as args
@NoArgsConstructor //creates constructor that takes no args at all
public class Movie {
    @Id //lets framework know that this property should be treated as unique identifier for database
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;

    private List<String> genres;
    private List<String> backdrop;
    @DocumentReference //this will cause the database to only store the id of the reviews/ and the reviews will be in a separate collection
    private List<Review> reviewIds;

}
