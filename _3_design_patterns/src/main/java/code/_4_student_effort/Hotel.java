package code._4_student_effort;

public class Hotel {
    String name;
    String city;
    String adress;
    EnumStars stars;
    EnumRatings rating;
    int pricePerNight;

    boolean takeBreakfast;
    boolean takeMeals;
    boolean openBar;
    boolean spaAccess;
    boolean parking;
    boolean airportTransfer;

    Hotel(HotelBuilder builder) {
        name = builder.name;
        city = builder.city;
        adress = builder.adress;
        stars = builder.stars;
        rating = builder.rating;
        pricePerNight = builder.pricePerNight;

        takeBreakfast = builder.takeBreakfast;
        takeMeals = builder.takeMeals;
        openBar = builder.openBar;
        spaAccess = builder.spaAccess;
        parking = builder.parking;
        airportTransfer = builder.airportTransfer;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getAdress() {
        return adress;
    }

    public EnumStars getStars() {
        return stars;
    }

    public EnumRatings getRating() {
        return rating;
    }

    public int getPrice() {
        return pricePerNight;
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

    public static class HotelBuilder {

        String name;
        String city;
        String adress;
        EnumStars stars;
        EnumRatings rating;
        int pricePerNight;

        boolean takeBreakfast;
        boolean takeMeals;
        boolean openBar;
        boolean spaAccess;
        boolean parking;
        boolean airportTransfer;

        public HotelBuilder(String hotelName, String hotelCity, String hotelAdress, EnumStars hotelStars,
                            EnumRatings hotelRating, int price) {
            name = hotelName;
            city = hotelCity;
            adress = hotelAdress;
            stars = hotelStars;
            rating = hotelRating;
            pricePerNight = price;
        }

        public HotelBuilder setBreakfastService(boolean takeBreakfastService) {
            takeBreakfast = takeBreakfastService;
            return this;
        }

        public HotelBuilder setMealsService(boolean takeMealsService) {
            takeMeals = takeMealsService;
            return this;
        }

        public HotelBuilder setOpenBarService(boolean takeOpenBarService) {
            openBar = takeOpenBarService;
            return this;
        }

        public HotelBuilder setSpaAccessService(boolean takeSpaAccessService) {
            spaAccess = takeSpaAccessService;
            return this;
        }

        public HotelBuilder setParkingService(boolean takeParkingService) {
            parking = takeParkingService;
            return this;
        }

        public HotelBuilder setAirportTransferService(boolean takeAirportTransferService) {
            airportTransfer = takeAirportTransferService;
            return this;
        }

        public Hotel build() {
            return new Hotel(this);
        }

    }

    public StringBuilder getAvalableServices() {
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

}
