package com.techelevator.auctions.services;

import com.techelevator.util.BasicLogger;
import org.springframework.http.*;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.auctions.model.Auction;

public class AuctionService {

    public static String API_BASE_URL = "http://localhost:3000/auctions";
    private RestTemplate restTemplate = new RestTemplate();


    public Auction add(Auction newAuction) {
        // place code here

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Auction> requestEntity = new HttpEntity<>(newAuction, headers);

        try{
            ResponseEntity<Auction> response = restTemplate.exchange(API_BASE_URL, HttpMethod.POST,requestEntity, Auction.class);
            return response.getBody();

        } catch(Exception e){
            System.err.println("Error during POST request: "+e.getMessage());
            e.printStackTrace();
            return null;
        }

        //return null;
    }

    public boolean update(Auction updatedAuction) {
        // place code here
        boolean update = false;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Auction> requestEntity = new HttpEntity<>(updatedAuction, headers);

        try{
            restTemplate.put(API_BASE_URL+"/"+updatedAuction.getId(),requestEntity);
            return update = true;
        }catch(Exception e){
            System.err.println();
            e.printStackTrace();
            return update;
        }





        //return false;
    }

    public boolean delete(int auctionId) {
        // place code here
        boolean isDeleted = false;
        try{
            restTemplate.delete(API_BASE_URL+"/"+auctionId);
            return isDeleted = true;
        }catch(Exception e){
            System.err.println();
            return isDeleted;
        }

        //return false;
    }

    public Auction[] getAllAuctions() {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(API_BASE_URL, Auction[].class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return auctions;
    }

    public Auction getAuction(int id) {
        Auction auction = null;
        try {
            auction = restTemplate.getForObject(API_BASE_URL + "/" + id, Auction.class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return auction;
    }

    public Auction[] getAuctionsMatchingTitle(String title) {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(API_BASE_URL + "?title_like=" + title, Auction[].class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return auctions;
    }

    public Auction[] getAuctionsAtOrBelowPrice(double price) {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(API_BASE_URL + "?currentBid_lte=" + price, Auction[].class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return auctions;
    }

    private HttpEntity<Auction> makeEntity(Auction auction) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new HttpEntity<>(auction, headers);
    }

}
