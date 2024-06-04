package DAO;

import DButil.DButil;
import Models.Reservation;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReservationDAO {

    public boolean createReservation(Reservation reservation) {
        String query = "INSERT INTO Reservations (user_id, room_id, start_date, end_date, name, phone, email) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DButil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, reservation.getUserId());
            stmt.setInt(2, reservation.getRoomId());
            stmt.setDate(3, reservation.getStartDate());
            stmt.setDate(4, reservation.getEndDate());
            stmt.setString(5, reservation.getName());
            stmt.setString(6, reservation.getPhone());
            stmt.setString(7, reservation.getEmail());
            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Reservation getReservationById(int reservationId) {
        String query = "SELECT * FROM Reservations WHERE reservation_id = ?";
        try (Connection conn = DButil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, reservationId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Reservation reservation = new Reservation();
                reservation.setReservationId(rs.getInt("reservation_id"));
                reservation.setUserId(rs.getInt("user_id"));
                reservation.setRoomId(rs.getInt("room_id"));
                reservation.setStartDate(rs.getDate("start_date"));
                reservation.setEndDate(rs.getDate("end_date"));
                reservation.setName(rs.getString("name"));
                reservation.setPhone(rs.getString("phone"));
                reservation.setEmail(rs.getString("email"));
                return reservation;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean updateReservation(Reservation reservation) {
        String query = "UPDATE Reservations SET user_id = ?, room_id = ?, start_date = ?, end_date = ?, name = ?, phone = ?, email = ? WHERE reservation_id = ?";
        try (Connection conn = DButil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, reservation.getUserId());
            stmt.setInt(2, reservation.getRoomId());
            stmt.setDate(3, reservation.getStartDate());
            stmt.setDate(4, reservation.getEndDate());
            stmt.setString(5, reservation.getName());
            stmt.setString(6, reservation.getPhone());
            stmt.setString(7, reservation.getEmail());
            stmt.setInt(8, reservation.getReservationId());
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteReservation(int reservationId) {
        String query = "DELETE FROM Reservations WHERE reservation_id = ?";
        try (Connection conn = DButil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, reservationId);
            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
