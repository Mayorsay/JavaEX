package HW.views;

import java.util.Collection;
import java.util.Date;

import HW.models.Table;
import HW.presenters.View;
import HW.presenters.ViewObserver;

public class BookingView implements View {
    private ViewObserver observer;

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void reservationTable(Date orderDate, int tableNumber, String nameClients) {
        if (observer != null) {
            observer.onReservetionTable(orderDate, tableNumber, nameClients);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNumber) {
        if (reservationNumber > 0) {
            System.out.printf("Столик забранирован. Номер брони № %d\n", reservationNumber);
        } else {
            System.out.println("Что-то пошло не так.");
        }
    }

    @Override
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNumber, String nameClients) {
        if (observer != null) {
            observer.onUpdateReservetionTable(oldReservation, reservationDate, tableNumber, nameClients);
        }
    }

    @Override
    public void showСhangeReservationTable(int newReservationNumber, int newNumberTable) {
        if (newReservationNumber > 0) {
            System.out.printf(
                    "Изменение брони... Новый номер столика №%d\n",
                    newReservationNumber, newNumberTable);
        } else {
            System.out.println("Что-то пошло не так.");
        }
    }
}