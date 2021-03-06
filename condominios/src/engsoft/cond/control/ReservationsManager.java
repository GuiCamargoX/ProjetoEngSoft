package engsoft.cond.control;

import engsoft.cond.screen.ReservationsScreen;

public class ReservationsManager {

    private static ReservationsManager autoRef;


    private ReservationsScreen reservationsScreen;


    public ReservationsManager() {

    }

    public static ReservationsManager getInstance() {
        if (autoRef == null) {
            autoRef = new ReservationsManager();
        }

        return autoRef;
    }


    public ReservationsScreen getReservationsScreen() {
        if (reservationsScreen == null) {
            reservationsScreen = new ReservationsScreen();
        }
        return reservationsScreen;
    }

}
