package ee.sdaacademy.cinema.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "seats")
@Getter
@Setter
public class Seat {

    @Id
    Integer seatId;
    Integer row;
    Integer number;

    @ManyToOne
    @JoinColumn(name = "roomId")
    Room room;

    @OneToMany(mappedBy = "seat")
    List <Ticket> ticketList;

    @ManyToMany
    @JoinTable (
            name = "reservation_seat",
            joinColumns = {@JoinColumn(name = "seatId")},
            inverseJoinColumns = {@JoinColumn(name = "reservationId")}
    )
    List<Reservation> reservationList;

}
