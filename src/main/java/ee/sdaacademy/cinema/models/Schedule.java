package ee.sdaacademy.cinema.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "schedules")
@Getter
@Setter
public class Schedule {
    @Id
    Integer scheduleId;
    Date startTime;
    @ManyToOne
    @JoinColumn(name = "movieId")
    Movie movie;
    @ManyToOne
    @JoinColumn(name = "roomId")
    Room room;
    @OneToMany(mappedBy = "schedule")
    List <Reservation> reservationList;}
