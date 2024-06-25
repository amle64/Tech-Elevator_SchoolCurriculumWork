package com.techelevator.hotels;

import com.techelevator.hotels.model.Hotel;
import com.techelevator.hotels.model.Review;
import com.techelevator.hotels.services.ConsoleService;
import com.techelevator.hotels.services.HotelService;

import java.sql.SQLOutput;

public class App {

    private final ConsoleService consoleService = new ConsoleService();
    private final HotelService hotelService = new HotelService();

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        int menuSelection = -1;

        while (menuSelection != 0) {
            consoleService.printMainMenu();
            menuSelection = consoleService.promptForMenuSelection();
            if (menuSelection == 1) {
                //System.out.println("Not implemented");
                //HotelService hotel = new HotelService();
                Hotel[] hotels = hotelService.listHotels();
                /*for (int i = 0; i < hotels.length; i++) {
                    System.out.println((i+1)+": "+hotels[i].getName());
                }*/
                consoleService.printHotels(hotels);
            } else if (menuSelection == 2) {
                //System.out.println("Not implemented");
                Review[] reviews = hotelService.listReviews();
                consoleService.printReviews(reviews);
            } else if (menuSelection == 3) {
                //System.out.println("Not implemented");
                Hotel hotel = hotelService.getHotelById(1);
                consoleService.printHotel(hotel);
            } else if (menuSelection == 4) {
                //System.out.println("Not implemented");
                Review[] reviews = hotelService.getReviewsByHotelId(1);
                consoleService.printReviews(reviews);
            } else if (menuSelection == 5) {
                System.out.println("Not implemented");
            } else if (menuSelection == 6) {
                System.out.println("Not implemented");
            } else if (menuSelection == 0) {
                continue;
            } else {
                System.out.println("Invalid Selection");
            }
            consoleService.pause();
        }
    }

}
