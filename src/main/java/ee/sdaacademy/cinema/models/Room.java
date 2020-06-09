package ee.sdaacademy.cinema.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "rooms")
@Getter
@Setter
public class Room {

    @Id
    Integer roomId;
    Integer number;
    Integer maxSeats;
    String location;

    @OneToMany(mappedBy = "room")
    List <Seat> seatList;

    @OneToMany(mappedBy = "room")
    List<Schedule> scheduleList;

}
