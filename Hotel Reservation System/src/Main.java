

import Models.Reservation;
import Models.Room;
import Models.User;
import Services.ReservationService;
import Services.RoomService;
import Services.UserService;

import java.sql.Date;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static UserService userService = new UserService();
    private static RoomService roomService = new RoomService();
    private static ReservationService reservationService = new ReservationService();

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Welcome to Hotel Reservation System");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    isRunning = false;
                    System.out.println();
                    System.out.println("Exiting the system. Have a nice day!");
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userService.login(username, password)) {
            System.out.println();
            System.out.println("Login successful!");
            showMenu();
        } else {
            System.out.println();
            System.out.println("Invalid Username or Password");
        }
    }

    private static void register() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();


        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        boolean isSuccess = userService.register(user);
        if (isSuccess) {
            System.out.println();
            System.out.println("Registration successful!");
        } else {
            System.out.println();
            System.out.println("Registration failed. Please try again.");
        }
    }

    private static void showMenu() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Hotel Reservation System Menu");
            System.out.println("1. New Reservation");
            System.out.println("2. Check Reservation");
            System.out.println("3. Get Room Number");
            System.out.println("4. Update Reservation");
            System.out.println("5. Delete Reservation");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createNewReservation();
                    break;
                case 2:
                    checkReservation();
                    break;
                case 3:
                    getRoomNumber();
                    break;
                case 4:
                    updateReservation();
                    break;
                case 5:
                    deleteReservation();
                    break;
                case 6:
                    isRunning = false;
                    System.out.println();
                    System.out.println("Returning to main menu.");
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createNewReservation() {
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter room ID: ");
        int roomId = scanner.nextInt();
        System.out.print("Enter start date (yyyy-mm-dd): ");
        String startDateStr = scanner.next();
        System.out.print("Enter end date (yyyy-mm-dd): ");
        String endDateStr = scanner.next();
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter phone: ");
        String phone = scanner.next();
        System.out.print("Enter email: ");
        String email = scanner.next();

        Date startDate = Date.valueOf(startDateStr);
        Date endDate = Date.valueOf(endDateStr);

        Reservation reservation = new Reservation();
        reservation.setUserId(userId);
        reservation.setRoomId(roomId);
        reservation.setStartDate(startDate);
        reservation.setEndDate(endDate);
        reservation.setName(name);
        reservation.setPhone(phone);
        reservation.setEmail(email);

        boolean isSuccess = reservationService.createReservation(reservation);
        if (isSuccess) {
            System.out.println();
            System.out.println("Reservation created successfully.");
        } else {
            System.out.println();
            System.out.println("Failed to create reservation.");
        }
    }

    private static void checkReservation() {
        System.out.print("Enter reservation ID: ");
        int reservationId = scanner.nextInt();
        Reservation reservation = reservationService.getReservationById(reservationId);

        if (reservation != null) {
            System.out.println("Reservation details:");
            System.out.println("Reservation ID: " + reservation.getReservationId());
            System.out.println("User ID: " + reservation.getUserId());
            System.out.println("Room ID: " + reservation.getRoomId());
            System.out.println("Start Date: " + reservation.getStartDate());
            System.out.println("End Date: " + reservation.getEndDate());
            System.out.println("Name: " + reservation.getName());
            System.out.println("Phone: " + reservation.getPhone());
            System.out.println("Email: " + reservation.getEmail());
        } else {
            System.out.println();
            System.out.println("Reservation not found.");
        }
    }

    private static void getRoomNumber() {
        System.out.print("Enter room number: ");
        int roomNumber = scanner.nextInt();
        Room room = roomService.getRoomByNumber(roomNumber);

        if (room != null) {
            System.out.println("Room details:");
            System.out.println("Room ID: " + room.getRoomId());
            System.out.println("Room Number: " + room.getRoomNumber());
            System.out.println("Room Type: " + room.getRoomType());
            System.out.println("Is Available: " + room.isAvailable());
        } else {
            System.out.println();
            System.out.println("Room not found.");
        }
    }

    private static void updateReservation() {
        System.out.print("Enter reservation ID: ");
        int reservationId = scanner.nextInt();
        System.out.print("Enter new user ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter new room ID: ");
        int roomId = scanner.nextInt();
        System.out.print("Enter new start date (yyyy-mm-dd): ");
        String startDateStr = scanner.next();
        System.out.print("Enter new end date (yyyy-mm-dd): ");
        String endDateStr = scanner.next();
        System.out.print("Enter new name: ");
        String name = scanner.next();
        System.out.print("Enter new phone: ");
        String phone = scanner.next();
        System.out.print("Enter new email: ");
        String email = scanner.next();

        Date startDate = Date.valueOf(startDateStr);
        Date endDate = Date.valueOf(endDateStr);

        Reservation reservation = new Reservation();
        reservation.setReservationId(reservationId);
        reservation.setUserId(userId);
        reservation.setRoomId(roomId);
        reservation.setStartDate(startDate);
        reservation.setEndDate(endDate);
        reservation.setName(name);
        reservation.setPhone(phone);
        reservation.setEmail(email);

        boolean isSuccess = reservationService.updateReservation(reservation);
        if (isSuccess) {
            System.out.println();
            System.out.println("Reservation updated successfully.");
        } else {
            System.out.println();
            System.out.println("Failed to update reservation.");
        }
    }

    private static void deleteReservation() {
        System.out.print("Enter reservation ID: ");
        int reservationId = scanner.nextInt();
        boolean isSuccess = reservationService.deleteReservation(reservationId);

        if (isSuccess) {
            System.out.println();
            System.out.println("Reservation deleted successfully.");
        } else {
            System.out.println();
            System.out.println("Failed to delete reservation.");
        }
    }
}
