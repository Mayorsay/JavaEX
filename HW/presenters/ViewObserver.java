package HW.presenters;

import java.util.Date;


public interface ViewObserver {
    
    
    void onReservetionTable(Date orderDate, int tableNumber, String nameClients);

    void onUpdateReservetionTable(int oldReservation, Date reservationDate, int tableNumber, String nameClients);
}
