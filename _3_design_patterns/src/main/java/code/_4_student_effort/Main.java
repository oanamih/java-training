package code._4_student_effort;

public class Main {

    public static void main(String[] args) {
        Person guest = new Person("Oana", "Albina", "2981118105053");

        EnumStars hotelStars = new EnumStars(Stars.three);
        EnumRatings hotelRating = new EnumRatings(Rating.excellent);
        Hotel host = new Hotel.HotelBuilder("Giulia", "Rome", "str. Turini", hotelStars, hotelRating, 200)
                .setMealsService(true).setSpaAccessService(true).setParkingService(true)
                .build();

        System.out.printf(
                "Hotel " + host.getName() + " has the following services available:\n" + host.getAvalableServices());


        LocalDate aDate = LocalDate.parse("2021-11-17", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate lDate = LocalDate.parse("2021-11-21", DateTimeFormatter.ISO_LOCAL_DATE);
        Booking booking = new Booking.BookingBuilder(guest, host, aDate, lDate).setBreakfastService(true)
                .setSpaAccessService(true).setParkingService(true).build();

        System.out.printf(booking.person.getName() + " " + booking.person.getLastName()
                + " asked for a booking between " + booking.arriveDate + " and " + booking.leaveDate + " at hotel "
                + booking.hotel.getName() + " " + booking.hotel.stars.getStars()
                + " with the following services included:\n" + booking.getServices());
    }
}

