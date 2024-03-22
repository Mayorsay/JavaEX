package HW;

import java.util.Date;

import HW.models.TableModel;
import HW.presenters.BookingPresenter;
import HW.presenters.Model;
import HW.presenters.View;
import HW.views.BookingView;

public class program {

    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 2, "Иван");

        view.changeReservationTable(1001, new Date(), 3, "Иван");

    }

}
