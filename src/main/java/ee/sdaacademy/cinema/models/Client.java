package ee.sdaacademy.cinema.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "clients")
@Getter
@Setter

public class Client {
    @Id
    Integer clientId;
    String firstName;
    String lastName;
    String email;
    Date dateOfBirth;

    @OneToMany(mappedBy = "client")
    List <Reservation> reservationList;
}
