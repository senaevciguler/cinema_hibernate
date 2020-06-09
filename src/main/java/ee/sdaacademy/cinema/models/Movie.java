package ee.sdaacademy.cinema.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movies")
@Getter
@Setter
public class Movie {
    @Id
    Integer movieId;
    String name;
    String category;
    Integer durationInMinutes;
    String description;

    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER)
    List <Schedule> scheduleList;
}
