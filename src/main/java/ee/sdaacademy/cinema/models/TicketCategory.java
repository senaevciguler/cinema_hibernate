package ee.sdaacademy.cinema.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "ticketCategories")
@Getter
@Setter
public class TicketCategory {

    @Id
    Integer ticketCategoryId;
    String type;
    Integer price;

    @OneToMany(mappedBy = "category")
    List<Ticket> ticketList;

}
