package Services;


import DAO.RoomDAO;
import Models.Room;

public class RoomService {
    private RoomDAO roomDAO = new RoomDAO();

    public Room getRoomByNumber(int roomNumber) {
        return roomDAO.getRoomByNumber(roomNumber);
    }
}
