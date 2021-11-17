package code._4_student_effort;
import java.time.LocalDate;

public class Booking {
    Person person;
    Hotel hotel;
    LocalDate arriveDate;
    LocalDate leaveDate;
    int price;

    boolean takeBreakfast;
    boolean takeMeals;
    boolean openBar;
    boolean spaAccess;
    boolean parking;
    boolean airportTransfer;

    public Person getPerson() {
        return person;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public LocalDate getArriveDate() {
        return arriveDate;
    }

    public LocalDate getLeaveDate() {
        return leaveDate;
    }

    public int getPrice() {
        return price;
    }

    public boolean getBreakfast() {
        return takeBreakfast;
    }

    public boolean getMeals() {
        return takeMeals;
    }

    public boolean getOpenBar() {
        return openBar;
    }

    public boolean getSpaAccess() {
        return spaAccess;
    }

    public boolean getParking() {
        return parking;
    }

    public boolean getAirportTransfer() {
        return airportTransfer;
    }


    Booking(BookingBuilder builder) {
        person = builder.person;
        hotel = builder.hotel;
        arriveDate = builder.arriveDate;
        leaveDate = builder.leaveDate;
        price = builder.price;

        takeBreakfast = builder.takeBreakfast;
        takeMeals = builder.takeMeals;
        openBar = builder.openBar;
        spaAccess = builder.spaAccess;
        parking = builder.parking;
        airportTransfer = builder.airportTransfer;
    }

    public static class BookingBuilder {
        Person person;
        Hotel hotel;
        LocalDate arriveDate;
        LocalDate leaveDate;
        int price;

        boolean takeBreakfast;
        boolean takeMeals;
        boolean openBar;
        boolean spaAccess;
        boolean parking;
        boolean airportTransfer;

        BookingBuilder(Person guest, Hotel host, LocalDate aDate, LocalDate lDate) {
            person = guest;
            hotel = host;
            arriveDate = aDate;
            leaveDate = lDate;
        }

        public BookingBuilder setBreakfastService(boolean takeBreakfastService) {
            if (hotel.takeBreakfast)
                takeBreakfast = takeBreakfastService;
            else
                System.out.printf("Breakfast Service is not avalable for " + hotel.getName() + "\n");
            return this;
        }

        public BookingBuilder setMealsService(boolean takeMealsService) {
            if (hotel.takeMeals)
                takeMeals = takeMealsService;
            else
                System.out.printf("Meals Service is not avalable for " + hotel.getName() + "\n");
            return this;
        }

        public BookingBuilder setOpenBarService(boolean takeOpenBarService) {
            if (hotel.openBar)
                openBar = takeOpenBarService;
            else
                System.out.printf("Breakfast Service is not avalable for " + hotel.getName() + "\n");
            return this;
        }

        public BookingBuilder setSpaAccessService(boolean takeSpaAccessService) {
            if (hotel.spaAccess)
                spaAccess = takeSpaAccessService;
            else
                System.out.printf("Breakfast Service is not avalable for " + hotel.getName() + "\n");
            return this;
        }

        public BookingBuilder setParkingService(boolean takeParkingService) {
            if (hotel.parking)
                parking = takeParkingService;
            else
                System.out.printf("Breakfast Service is not avalable for " + hotel.getName() + "\n");
            return this;
        }

        public BookingBuilder setAirportTransferService(boolean takeAirportTransferService) {
            if (hotel.airportTransfer)
                airportTransfer = takeAirportTransferService;
            else
                System.out.printf("Breakfast Service is not avalable for " + hotel.getName() + "\n");
            return this;
        }

        public BookingBuilder setPrice() {
            price = 100;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }

    public StringBuilder getServices() {
        StringBuilder services = new StringBuilder();

        if (takeBreakfast)
            services.append("- Breakfast\n");
        if (takeMeals)
            services.append("- Meals\n");
        if (openBar)
            services.append("- Open Bar\n");
        if (spaAccess)
            services.append("- Spa\n");
        if (parking)
            services.append("- Parking\n");
        if (airportTransfer)
            services.append("- Airport Transfer\n");
        return services;
    }

    public String getApprovedServices() {
        // TODO Auto-generated method stub
        return null;
    }

}
