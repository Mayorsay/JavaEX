package HW.presenters;

import java.util.Collection;
import java.util.Date;

import HW.models.Table;


public interface Model {
   
    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNumber, String nameClients);

    int changeReservationTable(int oldReservation, Date reservationDate, int tableNumber, String nameClients);
}
