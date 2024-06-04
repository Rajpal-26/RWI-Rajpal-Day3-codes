package Services;


import DAO.ReservationDAO;
import Models.Reservation;

public class ReservationService {
    private ReservationDAO reservationDAO = new ReservationDAO();

    public boolean createReservation(Reservation reservation) {
        return reservationDAO.createReservation(reservation);
    }

    public Reservation getReservationById(int reservationId) {
        return reservationDAO.getReservationById(reservationId);
    }

    public boolean updateReservation(Reservation reservation) {
        return reservationDAO.updateReservation(reservation);
    }

    public boolean deleteReservation(int reservationId) {
        return reservationDAO.deleteReservation(reservationId);
    }
}
