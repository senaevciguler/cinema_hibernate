#Cinema Application With Hibernate
##model
####Client
####Movie
####Reservation
####Room
####Schedule
####Seat
####Ticket
####TicketCategory
##repositories
####MovieRepository
####ClientRepository
####ReservationRepository
####RoomRepository
####ScheduleRepository
####SeatRepository
####TicketRepository
####TicketCategoryRepository
##utils
####HibernateUtils
#####Using Hibernate Framework as:
######import org.hibernate.Session;
######import org.hibernate.SessionFactory;
######import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
######import org.hibernate.cfg.Configuration;
######import org.hibernate.cfg.Environment;
######import org.hibernate.service.ServiceRegistry;
###Application(main method)
######public static void main ( String[] args ) {
              MovieRepository repository = new MovieRepository();
              repository.findAll().stream().forEach(movie -> {
                  System.out.println(movie.getName());
              });
          }


