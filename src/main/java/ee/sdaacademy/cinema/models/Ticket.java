package ee.sdaacademy.cinema.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
@Getter
@Setter
public class Ticket {
    @Id
    Integer ticketId;
    Integer scheduleId;
    @ManyToOne
    @JoinColumn(name = "seatId")
    Seat seat;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    TicketCategory category;

}
