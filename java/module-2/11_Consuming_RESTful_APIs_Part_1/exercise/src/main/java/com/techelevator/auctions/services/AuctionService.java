package com.techelevator.auctions.services;

import org.apiguardian.api.API;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.techelevator.auctions.model.Auction;

import java.util.ArrayList;
import java.util.List;

public class AuctionService {

    public static String API_BASE_URL = "http://localhost:3000/auctions";
    private RestTemplate restTemplate = new RestTemplate();


    public Auction[] getAllAuctions() {
        // call api here
        //RestTemplate restTemplate = new RestTemplate();
        ResponseEntity <Auction[]> response = restTemplate.getForEntity(API_BASE_URL, Auction[].class);
        return response.getBody();
        //return null;
    }

    public Auction getAuction(int id) {
        // call api here
        ResponseEntity <Auction> response = restTemplate.getForEntity(API_BASE_URL+"/"+id,Auction.class);
        return response.getBody();
        //return null;
    }

    public Auction[] getAuctionsMatchingTitle(String title) {
        // call api here
        String getTitleUrl = API_BASE_URL+"?title="+title;
        ResponseEntity <Auction[]> response = restTemplate.getForEntity(getTitleUrl,Auction[].class);
        return response.getBody();
        //return null;
    }

    public Auction[] getAuctionsAtOrBelowPrice(double price) throws NullPointerException{
        // call api here
        Auction [] arrayOfAuctions = getAllAuctions();
        List<Auction> listOfAuctions = new ArrayList<>();
        for (Auction auction:arrayOfAuctions){
            double currentBid = auction.getCurrentBid();
            if (currentBid>price){
                continue;
            }
            listOfAuctions.add(auction);

        }
        Auction [] filteredAuctions = new Auction [listOfAuctions.size()];
        filteredAuctions = listOfAuctions.toArray(filteredAuctions);
        return filteredAuctions;
        //return null;
    }

}
