package HW.presenters;

import java.util.Collection;
import java.util.Date;

import HW.models.Table;

public interface View {

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNumber);

    void showСhangeReservationTable(int reservationNumber, int newNumberTable);

    void setObserver(ViewObserver observer);
    
    void reservationTable(Date orderDate, int tableNumber, String nameClients);

    void changeReservationTable(int oldReservation, Date reservationDate, int tableNumber, String nameClients);

}
