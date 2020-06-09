package ee.sdaacademy.cinema.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "reservations")
@Getter
@Setter
public class Reservation {
    @Id
    Integer reservationId;
    Integer isPaid;
    @ManyToOne
    @JoinColumn(name = "clientId")
    Client client;
    @ManyToOne
    @JoinColumn(name = "scheduleId")
    Schedule schedule;
    @ManyToMany(mappedBy = "reservationList")
    List <Seat> seatList;

}
